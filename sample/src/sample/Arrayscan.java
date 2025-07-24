package sample;
import java.util.ArrayList;
import java.util.*;
public class Arrayscan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> names=new ArrayList<String>();
		System.out.println("How many names");
		int n=sc.nextInt();
		System.out.println("Enter"+n+"names-");
		for(int i=0;i<n;i++);
		{
			names.add(sc.next());
		}
		Collections.sort(names);
		{
		System.out.println(names);
	}
      sc.close();}
}
