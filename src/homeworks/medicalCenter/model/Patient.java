package homeworks.medicalCenter.model;

import homeworks.medicalCenter.util.DateUtil;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Patient extends Person implements Serializable {
    private Doctor doctor;
private Date createdDate;

    public Patient(String id, String name, String surname, String phoneNumber, Doctor doctor, Date createdDate) {

        super(id, name, surname, phoneNumber);
        this.doctor = doctor;
        this.createdDate = createdDate;
    }

    public Patient() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(doctor, patient.doctor) && Objects.equals(createdDate, patient.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doctor, createdDate);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "doctor=" + doctor +
                ", createdDate=" + DateUtil.fromDateToString(createdDate ) +
                "} " + super.toString();
    }
}
