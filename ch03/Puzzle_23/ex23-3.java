import java.util.Random;

public class Rhymes {
    private static Random rnd = new Random();
    public static void main(String[] args) {
	System.out.println("PGM".charAt(rnd.nextInt(3)) + "ain");
    }
}
