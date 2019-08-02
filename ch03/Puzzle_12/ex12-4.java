// 잘못 된 println() 메서드를 호출합니다.
class Abc {
    public static void main(String[] args) {
	String letters = "ABC";
	Object numbers = new char[] { '1', '2', '3' };
	System.out.print(letters + " easy as ");
	System.out.println(numbers); // println(Object) 메서드를 호출합니다.
    }
}
