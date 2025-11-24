package homeworks.medicalCenter.model;

import homeworks.medicalCenter.util.DateUtil;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Doctor extends Person implements Serializable {
    private String email;
    private String profession;
    private Date createdDate;

    public Doctor(String id, String name, String surname, String phoneNumber, String email, String profession, Date createdDate) {
        super(id, name, surname, phoneNumber);
        this.email = email;
        this.profession = profession;
        this.createdDate = createdDate;
    }

    public Doctor() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
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
        Doctor doctor = (Doctor) o;
        return Objects.equals(email, doctor.email) && Objects.equals(profession, doctor.profession) && Objects.equals(createdDate, doctor.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, profession, createdDate);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                ", createdDate=" + DateUtil.fromDateToString(createdDate)  +
                "} " + super.toString();
    }
}
