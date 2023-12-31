package observerPattern;

public class RealtimeMetrics implements Observer {
    private static RealtimeMetrics instance;
    //create singleton class for relatimemetrics class
    private RealtimeMetrics(){
        
    }
    public static RealtimeMetrics getInstance() {
        if (instance == null) {
            synchronized (RealtimeMetrics.class) {
                if (instance == null) {
                    instance = new RealtimeMetrics();
                }
            }
        }
        return instance;
    }

    int likes=0;
    int comments=0;
    @Override
    public void update(String data) {
        if(data.contains("Like")) likes+=1;
        else if(data.contains("Comment")) comments+=1;
        else {
            System.out.println("Invalid Update data: "+ data);
            return;
        }
        System.out.println("likes : "+likes+"   comments: "+comments);
    }   
    
}
