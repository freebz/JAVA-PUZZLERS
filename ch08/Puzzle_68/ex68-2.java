public class ShadesOfGray {
    public static void main(String[] args) {
	System.out.println(Ex.Why.z);
    }
}

class Ex {
    static class Why {
	static String z = "Black";
    }
    static See y = new See();
}

class See {
    String z = "White";
}
