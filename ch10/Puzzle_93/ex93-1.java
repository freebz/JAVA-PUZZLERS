public class PrintWords {
    public static void main(String[] args) {
	System.out.println(Words.FIRST  + " " +
			   Words.SECOND + " " +
			   Words.THIRD);
    }
}

public class Words {
    private Words() { };  // 인스턴스화를 못하게 막습니다.
    public static final String FIRST  = "the";
    public static final String SECOND = null;
    public static final String THIRD  = "set";
}
