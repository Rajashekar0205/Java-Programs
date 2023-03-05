/**
 * 
 */
package Practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Raja shekar
 *
 */
public class WriteDataFromFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     FileWriter file1= new FileWriter("C:\\Users\\Raja shekar\\OneDrive\\Desktop\\writer.txt");
     BufferedWriter bw=new BufferedWriter(file1);
     bw.write("Frist line input from writer\n");
     bw.write("second line input from writer\n");
     bw.write("Third line input from writer\n");
     System.out.println("successful data written");
     bw.close();
     
	}
	

}
