public class Donations {
	//The number of individual donations
	private int numIndividual;
	
	// The total of all individual donations
	private int amtIndividual;
	
	// The number of business donations
	private int numBusiness;
	
	// The total of all business donations
	private int amtBusiness;
	
	// The number of other donations
	private int numOther;
	
	// The total of all other donations
	private int amtOther;
	
	//process donations
	public void processDonation(String cat, double donation){
	     
	        if(cat.equals("individual"))
	        {
	            if(donation > 0){
	                numIndividual++;
	                amtIndividual = (int) (amtIndividual + donation);
	            }
	            else
	            {
	                numIndividual--;
	                amtIndividual = (int) (amtIndividual - donation);
	            }
	        }
	        else if(cat.equals("business"))
	        {
	            if(donation > 0){
	                numBusiness++;
	                amtBusiness = (int) (amtBusiness + donation);
	            }
	            else
	            {
	                numBusiness--;
	                amtBusiness = (int) (amtBusiness - donation);
	            }
	        }
	        else if(cat.equals("other"))
	        {
	            if(donation > 0)
	            {
	                numOther++;
	                amtOther = (int) (amtOther + donation);
	            }
	            else
	            {
	                numOther--;
	                amtOther = (int) (amtOther - donation);
	            }
	        }

	        // this will print the category and donation amount
	        System.out.printf("%-13s \"donation amount\" %5.2f\n", cat, donation);

	    }

	    // get statistics method
	    public void getStatistics(){
	    	
	    	System.out.println("Number of donations for individual: " +numIndividual);
	        System.out.println("Total donations for individual: " +amtIndividual);
	        System.out.println();
	        System.out.println("Number of donations for business: " +numBusiness);
	        System.out.println("Total donations for business: " +amtBusiness);
	        System.out.println();
	        System.out.println("Number of donations for other: " +numOther);
	        System.out.println("Total donations for other: " +amtOther);
	        System.out.println();
	    }

	}
	

