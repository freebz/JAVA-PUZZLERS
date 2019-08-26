public class Words {
    private Words() { }; // 인스턴스화를 못하게 막습니다.
    public static final String FIRST  = ident("the");
    public static final String SECOND = ident(null);
    public static final String THIRD  = ident("set");

    private static String ident(String s) {
	return s;
    }
}
