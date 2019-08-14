public class UnwelcomeGuest {
    public static final long GUEST_USER_ID = -1;
    private static final long USER_ID =getUserIdOrGuest();
    private static long getUserIdOrGuest() {
	try {
	    return getUserIdFromEnvironment();
	} catch (IdUnavailableException e) {
	    System.out.println("Logging in as guest");
	    return GUEST_USER_ID;
	}
    }
    ... // 생략
}
