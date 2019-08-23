package library;
public final class Api {
    // private static class String {}
    public static String newString() {
	return new String();
    }
}

package client;
import library.Api;
public class Client {
    String s = Api.newString();
}
