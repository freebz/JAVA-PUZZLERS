public class Workout {
    public static void main(String[] args) {
	workHard();
	System.out.println("It's time.");
    }

    private static void workHard() {
	try {
	    workHard();
	} finally {
	    workHard();
	}
    }
}
