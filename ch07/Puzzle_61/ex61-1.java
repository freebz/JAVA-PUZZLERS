import java.util.*;

public class DatingGame {
    public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	cal.set(1999, 12, 31); // 년, 월, 일
	System.out.print(cal.get(Calendar.YEAR) + " ");

	Date d = cal.getTime();
	System.out.println(d.getDay());
    }
}
