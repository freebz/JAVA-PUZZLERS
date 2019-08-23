// 섀도윙

class WhoKnows {
    static String sentence = "I don't know.";

    public static void main(String[] args) {
	String sentence = "I know!"; // static 필드 sentence를 섀도윙합니다.
	System.out.println(sentence);// 지역변수 sentence가 출력됩니다.
    }
}


class Belt {
    private final int size;
    public Belt(int size) { // 매개변수 size가 필드 size를 섀도윙합니다.
	this.size = size;
    }
}
