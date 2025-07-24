package sample;
import java.util.HashMap;
public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> student=new HashMap<>();
		student.put(101,"sachin");
		student.put(102, "Ranjith");
		student.put(103,"manis");
		student.put(104,"vishnu");
		for(Integer roll:student.keySet()) {
			System.out.println("Roll no:"+roll+",Name:"+student.get(roll));
		}

	}

}
