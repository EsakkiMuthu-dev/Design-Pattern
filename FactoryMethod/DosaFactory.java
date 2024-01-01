package FactoryMethod;

public class DosaFactory  implements DishFactory{

    @Override
    public Dish prepareDish()
    {
        return new Dosa();
    }
    
}
