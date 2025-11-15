package homework1.medicalCenter.storage;

import homework1.medicalCenter.model.Doctor;

public class DoctorStorage {
    Doctor[] doctors = new Doctor[10];
    int size = 0;

    public void add(Doctor doctor) {
        if (size == doctors.length) {

            extend();
        }
        doctors[size++] = doctor;
    }

    private void extend() {
        Doctor[] tmp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, tmp, 0, size);
        doctors = tmp;
    }


    public void printAllDoctors() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i] + " ");

        }
    }

    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().equals(profession)) {
                System.out.println(doctors[i]);
            }

        }

    }

    public void deleteDoctorByID(String doctorId) {
        int indexById = getIndexById(doctorId);

        if (indexById == -1) {
            System.out.println("Doctor doesn't exist!!!");
            return;
        }
        for (int i = indexById; i < size - 1; i++) {
            doctors[i] = doctors[i + 1];
        }
        size--;
    }


    private int getIndexById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(doctorId)) {
                return i;
            }

        }
        return -1;
    }
    public void changeDoctorById(String id){



    }


    public Doctor getDoctorById(String id){
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)){
                return doctors[i];
            }

        }
        return null;
    }
}
