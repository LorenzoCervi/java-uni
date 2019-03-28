package IO;
import java.io.*;
import java.util.Scanner;

public class esercizio1 {

	public static void main(String [] args)
	{
		String riga="";
	
		int i=0;
		try {
			BufferedReader F1=new BufferedReader(new FileReader("file1.txt"));
			PrintWriter F2=new PrintWriter( new FileWriter("file2.txt"));
			while(riga != null)
			{
				
					riga=F1.readLine();
					if(i%2!=0){
					F2.println(riga);
					//F2.flush() forza l'uscita della stringa
				}
				i++;
			}
			F1.close();
			F2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
