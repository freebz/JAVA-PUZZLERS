class Point {
    private final int x, y;
    private final String name;

    Point(int x, int y) {
	this.x = x;
	this.y = y;
	name = makeName();	// 3. 자식 클래스의 메서드를 호출합니다.
    }

    protected String makeName() {
	return "[" + x + "," + y + "]";
    }

    public final String toString() {
	return name;
    }
}

public class ColorPoint extends Point {
    private final String color;

    ColorPoint(int x, int y, String color) {
	super(x, y);		// 2. 부모 클래스의 생성자를 호출합니다.
	this.color = color;	// 5. 비어 있는 final 필드를 초기화합니다(늦었음).
    }

    protected String makeName() {
	// 4. 자식 클래스의 생성자가 호출되기 전에 실행됩니다.
	return super.makeName() + ":" + color;
    }

    public static void main(String[] args) {
	// 1. 자식 클래스의 생성자를 호출합니다.
	System.out.println(new ColorPoint(4, 2, "purple"));
    }
}
