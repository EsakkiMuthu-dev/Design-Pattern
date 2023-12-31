package observerPattern;

import java.util.ArrayList;

public class CommentPub implements Observable {
    ArrayList<Observer>  subs = new ArrayList<>();

    @Override
    public void add(Observer ob) { subs.add(ob);}

    public void remove(Observer ob) {subs.remove(ob);}
    public void notifySub()
    {
        subs.forEach((Observer o) ->   o.update("User Commented") );
    }
    public void addComment(){
        notifySub();
    }

}
