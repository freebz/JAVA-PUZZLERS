// 교착상태를 막는 안 좋은 방법입니다. 오류가 발생할 가능성이 높고 복잡합니다.
public class Lazy {
    private static boolean initialized = false;
    private static Thread t = new Thread(new Runnable() {
	public void run() {
	    initialized = true;
	}
    });
    static {
	t.start();
    }

    public static void main(String[] args) {
	try {
	    t.join();
	} catch (InterruptedException e) {
	    throw new AssertionError(e);
	}
	System.out.println(initialized);
    }
}
