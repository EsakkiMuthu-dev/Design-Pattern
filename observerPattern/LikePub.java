package observerPattern;

import java.util.ArrayList;

public class LikePub implements Observable {
     ArrayList<Observer> subs = new ArrayList<Observer>();
     public void add(Observer ob){ subs.add(ob);}
     public void remove(Observer ob) {subs.remove(ob);}

     public void notifySub(){
         subs.forEach((Observer o) -> o.update("User Liked"));
     }
     public void addLike(){
        notifySub();
        }

    
}
