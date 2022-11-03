package java_prpgrams;

public class Method_overloading {
	
	
	public void method(int a,int b)
	{
		System.out.println("addition of a and b "+(a+b));
	}
	
	public void method(int a,int b,int c)
	{
		System.out.println("addition of a and b and c "+(a+b+c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_overloading obj = new Method_overloading();
		obj.method(10, 20);
		obj.method(10,20,30);


	}

}
