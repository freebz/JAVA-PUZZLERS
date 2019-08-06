public class EscapeRout {
    public static void main(String[] args) {
	// \u0022는 유니코드 이스케이프 시퀀스로, 큰 따옴표(")를 나타냅니다.
	System.out.println("a\u0022.length() + \u0022b".length());
    }
}
