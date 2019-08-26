import java.io.*;

public class CopyDog { // 원본과 복사본 확인
    public static void main(String[] args) {
	Dog newDog = (Dog) deepCopy(Dog.INSTANCE);
	System.out.println(newDog == Dog.INSTANCE);
	System.out.println(newDog);
    }

    // 이렇게 작성하면 매우 느립니다!
    public static Object deepCopy(Object obj) {
	try {
	    ByteArrayOutputStream bos = new ByteArrayOutputStream();
	    (new ObjectOutputStream(bos)).writeObject(obj);
	    ByteArrayInputStream bin =
		new ByteArrayInputStream(bos.toByteArray());
	    return new ObjectInputStream(bin).readObject();
	} catch (Exception e) {
	    throw new IllegalArgumentException(e);
	}
    }
}
