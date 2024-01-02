package chainOfResponsibility;

public class Chain {
    
    private Handler handler;

    public void addHandler(Handler handler){
        if(handler == null)
        {
            this.handler=handler;
        }else{
            this.handler.addNext(handler);
            this.handler= handler;
        }
    }

    public void handleRequest() {
        if (handler != null) {
            handler.handleRequest();
        }

}
}
