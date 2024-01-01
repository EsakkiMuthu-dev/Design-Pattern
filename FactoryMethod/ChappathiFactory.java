package FactoryMethod;

public class ChappathiFactory  implements DishFactory{
    @Override
    public Dish prepareDish()
    {
        return new Chappathi();
    }
    
}
