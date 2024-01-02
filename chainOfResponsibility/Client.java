package chainOfResponsibility;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) {

        Chain chain = new Chain();
        chain.addHandler(new Handler1());
        chain.addHandler(new Handler2());
        chain.addHandler(new Handler3());
        chain.handleRequest();
    }
}