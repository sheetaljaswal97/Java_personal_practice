package java_prpgrams;



class first_overriding
{
	public void method()
	{
		System.out.println("method one");
	}
}

class second_overriding extends first_overriding
{
	public void method()
	{
		System.out.println("method second");
		super.method();
	}
}

public class Method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		second_overriding obj = new second_overriding();
		obj.method();

	}

}
