public class Transitive {
    public static void main(String[] args) throws Exception {
	long x = Long.MAX_VALUE;
	double y = (double) Long.MAX_VALUE;
	long z = Long.MAX_VALUE - 1;

	System.out.print ((x == y) + " ");  // 정확하지 않아요!
	System.out.print ((y == z) + " ");  // 정확하지 않아요!
	System.out.println(x == z);	 // 정확해요!
    }
}
