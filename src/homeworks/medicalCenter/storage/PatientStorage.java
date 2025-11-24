package homeworks.medicalCenter.storage;

import homeworks.medicalCenter.model.Doctor;
import homeworks.medicalCenter.model.Patient;

import java.io.Serializable;

public class PatientStorage implements Serializable {
    Patient[] patients = new Patient[10];
    int size = 0;
    public void add(Patient patient) {
        if (size == patients.length) {

            extend();
        }
       patients[size++] =patient;
    }

    private void extend() {
        Patient[] tmp = new Patient[patients.length + 10];
        System.arraycopy(patients, 0, tmp, 0, size);
       patients = tmp;
    }

    public void printAllPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().equals(doctor)){
                System.out.println(patients[i]);
            }
        }
    }
public void printAllPatients(){
    for (int i = 0; i < size; i++) {
        System.out.println(patients[i]);
    }
}
}
