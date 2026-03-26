package tns.demo;

public class Variables{
	int price=10; //instance variable
	
	void print()
	{
		String msg="Hello World" ; //local var
		System.out.println(msg);
		
	}
	static String message ="Hello Students"; //static var

	public static void main(String[] args) {
		VariableDemo obj=new VariableDemo();
		System.out.println("the value of price " + obj.price );
		obj.print();
		System.out.println(message);	
    
	}

}
