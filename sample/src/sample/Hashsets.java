package sample;
import java.util.HashSet;

public class Hashsets {

	public static void main(String[] args) {
	HashSet<String> animals=new HashSet<>();
	animals.add("dog");
	animals.add("cat");
	animals.add("tiger");
	System.out.println("animals in the set-");
	for(String animal:animals) {
		System.out.println(animal);
	}

	}

}
