import java.util.*;
public class NameGame {
    public static void main(String args[]) {
	Map<String, String> m = new IdentityHashMap<String, String>();
	m.put(new String("Mickey"), "Mouse");
	m.put(new String("Mickey"), "Mantle");
	System.out.println(m.size());
    }
}
