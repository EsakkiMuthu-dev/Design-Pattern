package FactoryMethod;

public class IdliFactory implements DishFactory {

    @Override
    public  Dish prepareDish()
    {
        return new Idli();
    }
}
