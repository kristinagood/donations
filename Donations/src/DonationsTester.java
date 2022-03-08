import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DonationsTester {
	
	    public static void main(String[] args) throws FileNotFoundException {
	      
	    	// prompt for the user
	        System.out.print("Would you like to process donations now? (enter ‘Yes’ to continue): ");
	        File inputFile = new File("Donations.txt");
			 
	        Donations giveToMe = new Donations();
	       
			//if(keep_going.equals("Yes"))
	
			
			 {
				double amount = 0;
				String category = " ";
			 Scanner in = new Scanner(inputFile);
			
			while(in.hasNextLine()) 
			 {
				 String what = in.nextLine();
				 if(what.equals("<EOF>")) {break;}
				 amount = Double.parseDouble(what.replaceAll("[^0-9|^-]",""));
				if (what.startsWith("<individual donation>"))
					 category = "individual";
				 else if (what.startsWith("<business donation>"))
					 category = "business";
				 else if (what.startsWith("<other donation>"))
					 category = "other";
				giveToMe.processDonation(category, amount);
			 }
			System.out.println(amount);
			System.out.println(category);
			
			giveToMe.getStatistics();
			 in.close();
			 
			 
			 
		}
	}			
}		
				