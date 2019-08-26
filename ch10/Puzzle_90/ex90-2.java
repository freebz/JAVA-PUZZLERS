public class Outer {
    public Outer() {}

    class Inner1 extends Outer {
	Inner1() {
	    super(); // Outer() 생성자 호출
	}
    }

    class Inner2 extends Inner1 {
	Inner2() {
	    super(); // Inner1() 생성자 호출
	}
    }
}
