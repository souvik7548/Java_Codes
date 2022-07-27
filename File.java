import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File {
	public static void main(String...args)  throws Exception{
		FileInputStream fis=null;
		FileOutputStream fos=null;
		fis=new FileInputStream("D:\\text.txt");
		fos=new FileOutputStream("D:\\text2.txt");
		while(fis.available()>0) {
			fos.write(fis.read());
		}
		System.out.println("data copied");
		fos.close();
		fis.close();
	}

}
