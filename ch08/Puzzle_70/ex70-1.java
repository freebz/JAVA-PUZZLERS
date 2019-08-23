package click;
public class CodeTalk {
    public void doIt() {
	printMessage();
    }

    void printMessage() {
	System.out.println("Click");
    }
}

package hack;
import click.CodeTalk;

public class TypeIt {
    private static class ClickIt extends CodeTalk {
	void printMessage() {
	    System.out.println("Hack");
	}
    }

    public static void main(String[] args) {
	ClickIt clickit = new ClickIt();
	clickit.doIt();
    }
}
