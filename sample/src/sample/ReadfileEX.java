package sample;
import java.io.FileInputStream;
public class ReadfileEX {

	public static void main(String[] args) {
try {
	FileInputStream fs=new FileInputStream("C:/Users/Sachin/OneDrive/Desktop/sachi/sachi.java");
	int i;
	while((i=fs.read())!=-1);
	{
		System.out.println((char)i);
	}
}catch(Exception e) {
	e.printStackTrace();
}
	}

}
