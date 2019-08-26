public class ApplePie {
    public static void main(String[] args) {
	int count = 0;
	for (int i = 0; i < 100; i++); {
	    count++;
	}
	System.out.println(count);
    }
}

import java.util.*;
public class BananaBred {
    public static void main(String[] args) {
	Integer[] array = { 3, 1, 4, 1, 5, 9 };
	Arrays.sort(array, new Comparator<Integer>() {
	    public int compare(Integer i1, Integer i2) {
		return i1 < i2 ? -1 : (i2 > i1 ? 1 : 0);
	    }
	});
	System.out.println(Arrays.toString(array));
    }
}

public class ChocolateCake {
    public static void main(String[] args) {
	System.out.println(true?false:true == true?false:true);
    }
}
