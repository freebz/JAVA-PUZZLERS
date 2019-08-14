import java.io.IOException;

public class Arcane1 {
    public static void main(String[] args) {
	try {
	    System.out.println("Hello world");
	} catch (IOException e) {
	    System.out.println("I've never seen println fail!");
	}
    }
}

public class Arcane2 {
    public static void main(String[] args) {
	try {
	    // 아무 것도 안 넣어도 됩니다!
	} catch (Exception e) {
	    System.out.println("This can't happen");
	}
    }
}

interface Type1 {
    void f() throws CloneNotSupportedException;
}

interface Type2 {
    void f() throws InterruptedException;
}

interface Type3 extends Type1, Type2 {
}

public class Arcane3 implements Type3 {
    public void f() {
	System.out.println("Hello world");
    }
    public static void main(String[] args) {
	Type3 t3 = new Arcane3();
	t3.f();
    }
}

   
