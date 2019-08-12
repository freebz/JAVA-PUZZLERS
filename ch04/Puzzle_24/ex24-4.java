public class BigDelight {
    private static final byte TARGET = 0x90;    // 오류 발생
    public static void main(String[] args) {
	for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
	    if (b == TARGET)
		System.out.print("Joy!");
	}
    }
}
