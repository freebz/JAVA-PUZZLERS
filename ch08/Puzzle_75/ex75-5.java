// 하이딩

class Base {
    public static void f() { }
}

class Derived extends Base {
    public static void f() { } // Base.f()를 숨김
}
