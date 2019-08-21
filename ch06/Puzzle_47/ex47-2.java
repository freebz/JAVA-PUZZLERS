class Dog {
    private static int woofCounter;
    public Dog() { }
    public static int woofCount() { return woofCounter; }
    public void woof() { woofCounter++; }
}

class Cat {
    private static int meowCounter;
    public Cat() { }
    public static int meowCount() { return meowCounter; }
    public void meow() { meowCounter++; }
}
