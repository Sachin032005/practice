package sample;

class computer{
	public void program()
	{
		System.out.println("the program running");
	}
}
class java extends computer{
	public void program() 
	{
		System.out.println("the java program running");
	}
	
}
class python extends computer{
	public void program() {
		System.out.println("the python program running");
	}
}
public class poly {

	public static void main(String[] args) {
	computer obj=new computer();
	computer java=new java();
	computer python=new python();
	obj.program();
    java.program();
    python.program();
	}

}
