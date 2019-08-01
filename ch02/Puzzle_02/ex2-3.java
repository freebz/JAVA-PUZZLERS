import java.math.BigDecimal;
public class Change {
    public static void main(String args[]) {
	System.out.println(new BigDecimal("2.00").
			   subtract(new BigDecimal("1.10")));
    }
}
