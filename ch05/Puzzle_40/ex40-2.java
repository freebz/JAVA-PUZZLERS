public class Car {
    private static Class engineClass = ... ; // 서비스 프로바이더
    private Engine engine = (Engine) engineClass.newInstance();
    public Car() { } // 두 개의 예외를 던집니다.
}
