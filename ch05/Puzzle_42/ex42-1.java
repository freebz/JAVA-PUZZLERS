public class Loop {
    public static void main(String[] args) {
	int[][] tests = { { 6, 5, 4, 3, 2, 1}, { 1, 2 },
			  { 1, 2, 3 }, { 1, 2, 3, 4 }, { 1 } };
	int successCount = 0;

	try {
	    int i = 0;
	    while (true) {
		if (thirdElementIsThree(tests[i++]))
		    successCount++;
	    }
	} catch (ArrayIndexOutOfBoundsException e) {
	    // 더 이상 테스트할 것이 없습니다.
	}
	System.out.println(successCount);
    }

    private static boolean thirdElementIsThree(int[] a)
    {
	return a.length >= 3 & a[2] == 3;
    }
}
