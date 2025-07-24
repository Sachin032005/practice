package sample;
import java.util.ArrayList;
import java.util.Collections;
public class Arraysorting {

	public static void main(String[] args) {
ArrayList<Integer>numbers=new ArrayList<Integer>();
numbers.add(50);
numbers.add(40);
numbers.add(80);
numbers.add(90);
//Collections.sort(numbers);
Collections.sort(numbers,Collections.reverseOrder());
for(int num:numbers) {
	System.out.println(num);
}
	}

}
