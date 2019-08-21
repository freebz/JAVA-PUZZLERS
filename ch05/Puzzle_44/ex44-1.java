public class Strange1 {
    public static void main(String[] args) {
	try {
	    Missing m = new Missing();
	} catch (java.lang.NoClassDefFoundError ex) {
	    System.out.println("Got it!");
	}
    }
}

public class Strange2 {
    public static void main(String[] args) {
	Missing m;
	try {
	    m = new Missing();
	} catch (java.lang.NoClassDefFoundError ex) {
	    System.out.println("Got it!");
	}
    }
}
