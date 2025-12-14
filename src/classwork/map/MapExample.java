package classwork.map;


import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();
        Student studentPoxos = new Student("poxos", "poxosyan", "poxos@maol.com", 37);
        Student studentPetros = new Student("Petros", "poxosyan", "Petrod@maol.com", 33);
        Student studentMartiros = new Student("Martiros", "poxosyan", "Martiros@maol.com", 45);
        studentMap.put("poxos@maol.com", studentPoxos);
        studentMap.put("Petrod@maol.com", studentPetros);
        studentMap.put("poxos@maol.com", studentMartiros);

        Student student = studentMap.get("poxos@maol.com");
        System.out.println(student);

    }
}
