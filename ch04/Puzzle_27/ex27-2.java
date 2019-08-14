public class Shifty {
    public static void main(String[] args) {
	int distance = 0;
	for (int val = -1; val != 0; val <<= 1)
	    distance++;
	System.out.println(distance);
    }
}
