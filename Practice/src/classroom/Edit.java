package classroom;
import java.io.FileWriter;
import java.io.IOException;
public class Edit {
	public static void main(String[]args) {
		try {
			FileWriter obj = new FileWriter("C:\\Users\\Aditya Ramesh\\Desktop\\Sample\\myFile.txt");
			obj.write("Sample text File");
			obj.close();
		}catch(IOException e) {
			System.out.println("Error Occured");
		}
	}

}
