package nikitaAutomationproject.automation;

public class classTwo extends classOne {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classOne cl = new classOne();
		classTwo c2= new classTwo();
		cl.details();
		c2.Name();
		
		
	}
	public void Name()
	{
		System.out.println(super.lName);
	}

}
