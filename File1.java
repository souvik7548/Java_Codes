import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {
	public static void main(String...args) throws IOException {
		FileOutputStream fos=new FileOutputStream("D:\\text.txt",true);
		String data="Souvik Das is the owner";
		for(int i=0;i<data.length();i++) {
			fos.write(data.charAt(i));
			
		}
		fos.close();
		
	}

}
