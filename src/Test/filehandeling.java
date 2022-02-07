package Test;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class filehandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String strl = "Order confirmation 1233434";
		
		FileOutputStream file1;
		try {
		file1 = new FileOutputStream("result.txt");
		file1.write(strl.getBytes());
		}catch (FileNotFoundException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
