/**
 * 
 */
package Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Raja shekar
 *
 */
public class ReadDataFromFile {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// ONE APPROCH using Scanner class and File class ro read file
		File file = new File("C:\\Users\\Raja shekar\\OneDrive\\Desktop\\READFILE.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

		// APPROCH 2 - using BufferedReader class and FileReader to read file
		{
			FileReader file2 = new FileReader("C:\\Users\\Raja shekar\\OneDrive\\Desktop\\READFILE.txt");
			BufferedReader br = new BufferedReader(file2);
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		}

	}

}
