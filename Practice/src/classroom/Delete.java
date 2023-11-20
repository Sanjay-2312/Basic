package classroom;
import java.io.File;
public class Delete {
	public static void main(String[]args) {
		File obj = new File("C:\\Users\\Aditya Ramesh\\Desktop\\Sample\\myFile.txt");
		if(obj.delete()) {
			System.out.println("File Deleted");
		}else {
			System.out.println("Failed to Delete");
		}
	}

}
