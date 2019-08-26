import java.util.*;
import java.io.*;

public class SerialKiller {
    public static void main(String[] args) {
	Sub sub = new Sub(666);
	sub.checkInvariant();

	Sub copy = (Sub) deepCopy(sub);
	copy.checkInvariant();
    }

    // 직렬화로 매개변수를 복사합니다(83번째 퍼즐 참고).
    static public Object deepCopy(Object obj) {
	try {
	    ByteArrayOutputStream bos =
		new ByteArrayOutputStream();
	    (new ObjectOutputStream(bos)).writeObject(obj);
	    ByteArrayInputStream bin =
		new ByteArrayInputStream(bos.toByteArray());
	    return new ObjectInputStream(bin).readObject();
	} catch (Exception e) {
	    throw new IllegalArgumentException(e);
	}
    }
}

class Super implements Serializable {
    final Set<Super> set = new HashSet<Super>();
}

final class Sub extends Super {
    private int id;
    public Sub(int id) {
	this.id = id;
	set.add(this); // 불변조건 생성
    }

    public void checkInvariant() {
	if (!set.contains(this))
	    throw new AssertionError("invariant violated");
    }

    public int hashCode() {
	return id;
    }

    public boolean equals(Object o) {
	return (o instanceof Sub) && (id == ((Sub)o).id);
    }
}
