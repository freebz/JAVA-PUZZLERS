package library;
public class Api {
    static class PackagePrivate {}
    public static PackagePrivate member = new PackagePrivate();
}

package client;
import library.Api;
class Client {
    public static void main(String[] args) {
	System.out.println(Api.member.hashCode());
    }
}
