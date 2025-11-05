package classwork.lesson12;

public class Student {

    private  String name;
    private  String surname;
    private  String phone;
    private  Language language;


    public Student(String name, String surname, String phone, Language language) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.language = language;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", language=" + language +
                '}';
    }
}
