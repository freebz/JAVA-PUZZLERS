public class Classifier {
    public static void main(String[] args) {
	System.out.println(classify('n') + classify('+') + classify('2'));
    }
    static String classify(char ch) {
	if ("0123456789".indexOf(ch) >= 0)
	    return "NUMERAL ";
	if ("abcdefghijklmnopqrstuvwxyz".indexOf(ch) >= 0)
	    return "LETTER ";
/* (아직 지원하지 않는 연산자들)
	if ("+-*/&|!=".indexOf(ch) >= 0)
	    return "OPERATOR ";
*/
	return "UNKNOWN ";
    }
}
