// 모호화

public class Obscure {
    static String System; // java.lang.System을 모호화합니다.

    public static void main(String[] args) {
	// 다음 줄은 System 식별자가 모호화되어 컴파일되지 않습니다.
	System.out.println("hello, obscure world!");
    }
}
