package sample;

public class processstudent {
	static void Studentdetails(String name,int mark)
	{
		System.out.println("student:"+name);
		System.out.println("mark:"+mark);
		if(mark >35)
		{
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		switch(mark/10)
		{
		case 10:
		case 9:
			System.out.println("grade:A+");
			break;
		case 8:
			System.out.println("grade:A");
			break;
		case 7:
			System.out.println("grade:B");
			break;
		case 6:
			System.out.println("grade:C");
			break;
		case 5:
			System.out.println("grade:D");
			break;
			default:
				System.out.println("grade:F");
		}
		System.out.println("----------------");
	}
	public static void main(String[] args) {
		String[]name= {"sachin","sinchu","virat"};
		int[]mark={90,92,34};
		for(int i=0;i<name.length;i++) {
			Studentdetails(name[i],mark[i]);
		}

}}
