package library;
class ApiBase {
    public static final int ANSWER = 42;
}

public final class Api extends ApiBase {
    // private static final int ANSWER = 6 * 9;
}

package client;
import library.Api;
public class Client {
    int answer = Api.ANSWER;
}
