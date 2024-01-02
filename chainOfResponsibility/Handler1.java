package chainOfResponsibility;

public class Handler1 implements Handler {
    private Handler next;
    
    @Override
    public void handleRequest() {
        System.out.println("Handler1 is handling request");
        if(next!=null){
            next.handleRequest();
        }
    }
    
    @Override
    public void addNext(Handler handler) {
            this.next=handler;
    }
    
}
