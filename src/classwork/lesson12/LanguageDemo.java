package classwork.lesson12;

public class LanguageDemo {
    public static void main(String[] args) {
//       Student student = new Student("poxos","poxosyan","1234",Language.RU);
//       System.out.println(student);
        Language[] values = Language.values();
        for (Language value : values) {
            System.out.println(value + " ");

        }

        String langStr = "RU";
        Language language = Language.valueOf(langStr);
        System.out.println(language);
        System.out.println(Language.EN.getHello());
    }


}
