class Cache {
    private static final int sum = computeSum();

    private static int computeSum() {
	int result = 0;
	for (int i = 0; i < 100; i++)
	    result += i;
	return result;
    }

    public static int getSum() {
	return sum;
    }
}
