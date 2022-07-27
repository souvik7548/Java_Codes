import. java.io.File;
import.java.io.FileInputStream;
import .java.io.IOException;
public class Demo2{
	public static void main(String...args){
		FileInputStream fis=null;
		try{
			fis=new FileInputStream("C:\Users\Souvik\javaprograms\abc.txt");
			int data=fis.read();
			while(data==-1){
				System.out.println((char)data);
				data=fis.read();
			}
		}
		catch(FileNotFoundException ex){
			System.out.println(ex);
		}
		
	}
}
			
