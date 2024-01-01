package AbstractFactoryPattern;

public class FormalDressFactory  implements  DressFactory
{
	@Override
	public  Shirt getShirt() {
		return  new FormalShirt();
	}
	@Override
	public  Pant getPant()
	{
		return  new FormalPant();
	}

}
