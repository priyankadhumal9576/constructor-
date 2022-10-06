
public class Laptop
{
	private int cost,operatingSystem;
	private String brand;
	private float storage;

	public Laptop()
	{
		brand="Lenovo";
	}
	
	public Laptop(int cost,int os)
	{
		this ();
		this.cost=cost;
		operatingSystem=os;
		
	}
	public Laptop(float storage)
	{
		this(15000,5);
		this.storage=storage;
	}
	public void showDetails()
	{
		System.out.println("laptop cost is:"+cost);
		System.out.println("os is:"+operatingSystem);
		System.out.println("brand is:"+brand);
		System.out.println("Storage is"+storage);
	}
	
}
