package homeworks.medicalCenter;

import homeworks.medicalCenter.model.Doctor;
import homeworks.medicalCenter.model.Patient;
import homeworks.medicalCenter.storage.DoctorStorage;
import homeworks.medicalCenter.storage.PatientStorage;
import homeworks.medicalCenter.util.FileUtil;

import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static DoctorStorage doctorStorage = FileUtil.deserializeDoctorStorage();
    private static PatientStorage patientStorage = FileUtil.deserializePatientStorage();

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
                    FileUtil.serializeDoctorData(doctorStorage);
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    FileUtil.serializeDoctorData(doctorStorage);
                    break;
                case UPDATE_DOCTOR_BY_ID:
                    updateDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    FileUtil.serializePatientData(patientStorage);
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
        System.out.println("please input doctor's email");
        String email = scanner.nextLine();
        System.out.println("please input doctor's profession ");
        String profession = scanner.nextLine();
        Date date = new Date();
        Doctor doctor = new Doctor(id, name, surname, phoneNumber, email, profession, date);
        doctorStorage.add(doctor);
        System.out.println("Doctor added successfully!!!!");

    }

    private static void addPatient() {
        doctorStorage.printAllDoctors();
        System.out.println("please input doctor's id");
        String doctorId = scanner.nextLine();

        Doctor doctor = doctorStorage.getDoctorById(doctorId);
        if (doctor == null) {
            System.out.println("Doctor id was invalid");
            return;
        }
        System.out.println("please input patient's Id");
        String id = scanner.nextLine();
        System.out.println("please input patient's name");
        String name = scanner.nextLine();
        System.out.println("please input patient's surname");
        String surname = scanner.nextLine();
        System.out.println("please input patient's phoneNumber");
        String phoneNumber = scanner.nextLine();

        Date date = new Date();
        Patient patient = new Patient(id, name, surname, phoneNumber, doctor, date);

        patientStorage.add(patient);
        System.out.println("patient added successfully !!!");
    }

    private static void searchDoctorByProfession() {
        System.out.println("please input profession");
        String profession = scanner.nextLine();
        doctorStorage.searchDoctorByProfession(profession);
    }

    private static void deleteDoctorById() {
        System.out.println("please input doctor's Id");
        String id = scanner.nextLine();
        doctorStorage.deleteDoctorByID(id);
    }

    private static void printAllPatientsByDoctor() {

        System.out.println("please input doctorId");
        String doctorId = scanner.nextLine();
        Doctor doctor = doctorStorage.getDoctorById(doctorId);
        if (doctor == null) {
            System.out.println("doctor does not found!!");

        }
        patientStorage.printAllPatientsByDoctor(doctor);
    }

    private static void updateDoctorById() {
        System.out.println("please input doctor id");
        String id = scanner.nextLine();
        Doctor doctorById = doctorStorage.getDoctorById(id);
        if (doctorById == null) {
            System.out.println("Doctor id was invalid");
            return;
        }
        System.out.println("please input new name");
        String name = scanner.nextLine();
        System.out.println("please input new surname");
        String surname = scanner.nextLine();
        System.out.println("please input new phoneNumber");
        String phoneNumber = scanner.nextLine();
        doctorById.setName(name);
        doctorById.setSurname(surname);
        doctorById.setPhoneNumber(phoneNumber);

    }
}


