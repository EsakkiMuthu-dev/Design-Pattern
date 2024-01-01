package AbstractFactoryPattern;

public class CasualDressFactory implements  DressFactory
{
	@Override
	public Shirt getShirt()
	{
		return  new CasualShirt();
	}

	@Override
	public  Pant getPant()
	{
		return  new CasualPant();
	}
}

