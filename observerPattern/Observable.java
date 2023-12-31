package observerPattern;

/**
 * Observable
 */
public interface Observable {

    public void add(Observer ob);
    public void remove(Observer ob);
    public void notifySub();
}