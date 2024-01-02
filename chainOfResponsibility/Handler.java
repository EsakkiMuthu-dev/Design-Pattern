package chainOfResponsibility;

public interface Handler {

    void handleRequest();
    void addNext(Handler handler);
}
