package myPackg;
import java.io.IOException; 

public class MyExcel {
 
	public static void main(String[] args) throws IOException {
		Excel ob= new Excel();
		double a=ob.readData(0,1);
        System.out.println("Value of a is "+a);
	}
}
