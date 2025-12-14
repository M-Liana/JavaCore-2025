package chapters.chepter14;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer []inums= {1,2,3,4,5};
        Stats<Integer> iob= new Stats<>(inums);
        double v = iob.average();
        System.out.println(v);

        Double []dnums= {1.1,2.2,3.3,4.4,5.5};
        Stats<Double>dob= new Stats<>(dnums);
        double v1 = dob.average();
        System.out.println(v1);

        System.out.println( " avj iob and dob");
        if (iob.sameAvg(dob)){
            System.out.println("avg iob == avj dob");
        }else{
            System.out.println("they are different");
        }

    }

    }

