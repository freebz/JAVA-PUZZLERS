// 수정 - 인스턴스를 초기화할 때 처리한 예외는 throw하지 않게 됩니다.
public class Car {
    private static Class engineClass = ... ;
    private Engine engine = newEngine();
    private static Engine newEngine() {
	try {
	    return (Engine) engineClass.newInstance();
	} catch (IllegalAccessException e) {
	    throw new AssertionError(e);
	} catch (InstantiationException e) {
	    throw new AssertionError(e);
	}
    }
    public Car() { }
}
