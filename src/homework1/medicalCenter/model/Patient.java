package homework1.medicalCenter.model;

import java.util.Date;
import java.util.Objects;

public class Patient extends Person {
    private Doctor doctor;

    public Patient(String id, String name, String surname, String phoneNumber, Doctor doctor) {
        super(id, name, surname, phoneNumber);
        this.doctor = doctor;
    }

    public Patient() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(doctor, patient.doctor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doctor);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "doctor=" + doctor +
                "} " + super.toString();
    }
}
