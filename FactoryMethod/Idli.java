package FactoryMethod;

public class Idli implements Dish {
 
    @Override
    public void prepare()
    {
        System.out.println("Idli Ready!! Enjoy");
    }
}
