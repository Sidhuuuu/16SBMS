package in.ashokit.beans;

public class Car {
	
	public Car()
	{
		System.out.println("car:: constructor..");
	}

	private IEngine eng;
	
	public  void setEng(IEngine eng)
	{
		System.out.println("setEng()  called");
		this.eng=eng;
	}
	
	public void drive()
	{
		int status=eng.start();
		if (status==0)
		{
			System.out.println("journey started...!!");
		}
	}
}






