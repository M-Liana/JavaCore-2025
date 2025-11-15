package homework1.medicalCenter;

import homework1.medicalCenter.exception.DoctorNotFoundException;
import homework1.medicalCenter.model.Doctor;
import homework1.medicalCenter.model.Patient;
import homework1.medicalCenter.storage.DoctorStorage;
import homework1.medicalCenter.storage.PatientStorage;

import java.util.Scanner;

public class MedicalCenterDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static DoctorStorage doctorStorage = new DoctorStorage();
    private static PatientStorage patientStorage = new PatientStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                 searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                   deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                   printAllPatientsByDoctor();
                    break;
                case PRINT_ALL_PATIENTS:
                    patientStorage.printAllPatients();
                    break;
                case PRINT_ALL_DOCTORS:
                    doctorStorage.printAllDoctors();
                    break;
                default:
                    System.out.println("Wrong commands ,,,try again!!");
            }
        }
    }

    private static void addDoctor() {
        System.out.println("please input doctor's Id");
        String id = scanner.nextLine();
        System.out.println("please input doctor's name");
        String name = scanner.nextLine();
        System.out.println("please input doctor's surname");
        String surname = scanner.nextLine();
        System.out.println("please input doctor's phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println(" please input doctor's email");
        String email = scanner.nextLine();
        System.out.println("please input doctor's profession ");
        String profession = scanner.nextLine();
        Doctor doctor = new Doctor(id, name, surname, phoneNumber, email, profession);
        doctorStorage.add(doctor);
        System.out.println(" Doctor added successfully!!!!");

    }

    private static void addPatient() {
        doctorStorage.printAllDoctors();
        System.out.println("please input doctor's id");
        String doctorId = scanner.nextLine();


        Doctor doctor = null;


        doctor = doctorStorage.getDoctorById(doctorId);

        System.out.println("please input patient's Id");
        String id = scanner.nextLine();
        System.out.println("please input patient's name");
        String name = scanner.nextLine();
        System.out.println("please input patient's surname");
        String surname = scanner.nextLine();
        System.out.println("please input patient's phoneNumber");
        String phoneNumber = scanner.nextLine();

        Patient patient = new Patient(id, name, surname, phoneNumber, doctor);
        patientStorage.add(patient);
        System.out.println("patient added successfully !!!");
    }
    private static void searchDoctorByProfession(){
        System.out.println("please input profession");
        String profession = scanner.nextLine();
        doctorStorage.searchDoctorByProfession(profession);
    }
    private static void deleteDoctorById(){
        System.out.println("please input doctor's Id");
        String id = scanner.nextLine();
        doctorStorage.deleteDoctorByID(id);
    }
    private static void printAllPatientsByDoctor(){

        System.out.println("please input doctorId");
        String doctorId = scanner.nextLine();
        Doctor doctor= doctorStorage.getDoctorById(doctorId);
        if (doctor == null) {
            System.out.println("doctor does not found!!");
            
        }
        patientStorage.printAllPatientsByDoctor(doctor);
    }
}


