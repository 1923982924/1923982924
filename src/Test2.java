import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


public class Test2 {

	public static void main(String[] args) throws FileNotFoundException{
		while(true){
			System.out.println(1);
			System.out.println("go");
			System.out.println("gogo");
		}
	}
	
	public static int method(){
		int i = 0;
		try{
			return i;
		}catch(Exception e){
			
		}finally{
			i++;
			return i;
		}
	}
}

