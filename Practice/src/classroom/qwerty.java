package classroom;
import java.io.File;
public class qwerty {
	public static void main(String[]args) {
		try {
			File obj = new File("C:\\Users\\Aditya Ramesh\\Desktop\\Sample\\myFile.txt");
			if(obj.createNewFile()) {
				System.out.println("New File Created" + obj.getName());	
			} else {
				System.out.println("File Already Exist");
			}
		}catch(Exception e) {
			System.out.println("Something went Wrong");
			}
	}
}
