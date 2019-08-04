package readtxt;

import java.io.File;
import java.util.Scanner;

public class ReadTxt {

	public static void main(String[] args)throws Exception {
		

		
		// beolvasunk egy txt és kiiratjuk a konzolra
		
		
		String txtEleresiUt = "C:/0_txt/ez_a_txt_fajl.txt";
		readTxt(txtEleresiUt);
		
	}
// ide jonne egy bolvasos metodus
	public static void readTxt(String eleresiUt)throws Exception {
		
		File theFile = new File(eleresiUt);
		
		try {
			Scanner scan = new Scanner(theFile);
			while(scan.hasNextLine()) {
				String dataRow = scan.nextLine();
				System.out.println(dataRow);
			}
			scan.close();
		}catch(Exception e){
			System.out.println("Error: "+e.getMessage());
		return;
		}
		
	}

	}
	
	
	
	
	
	
}
