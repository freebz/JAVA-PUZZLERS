interface TestInterface {
    void f() throws InterruptedException;
}

class TestClass implements TestInterface {
    public void f() throws IOException, InterruptedException { }
    public static void main(String[] args) { }
}
