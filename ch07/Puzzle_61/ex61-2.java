public class DatingGame {
    public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	cal.set(1999, Calendar.DECEMBER, 31);
	System.out.print(cal.get(Calendar.YEAR) + " ");
	System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}
