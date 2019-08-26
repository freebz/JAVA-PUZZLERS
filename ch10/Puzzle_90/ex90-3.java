public class Outer {
    class Inner1 extends Outer { }

    class Inner2 extends Inner1 {
	Inner2() {
	    Outer.this.super();
	}
    }
}
