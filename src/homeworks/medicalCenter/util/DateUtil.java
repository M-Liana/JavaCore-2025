package homeworks.medicalCenter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static String fromDateToString(Date date) {
        return sdf.format(date);
    }

    public static Date fromStrToDate(String str) throws ParseException {
        return sdf.parse(str);
    }
}
