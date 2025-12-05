package herenciasJavaPOO;

import java.util.HashMap;

public class SalesManager extends SalesRep{
	private HashMap<Integer, SalesRep> salesTeam = new HashMap<>();
	
	public SalesManager(String firstName,String lastName,int registration,int age,int daysWorked
			,int vacationDayTaken,double salary,int yearsWorked, double salesMade,String username, String password){
		 super(firstName, lastName, registration, age, daysWorked, vacationDayTaken, salary, yearsWorked, salesMade,
				 username,password);
		    
		    salesTeam = new HashMap<>();
	}
	public double calculateComission(){
	    double totalTeam = 0;
	    for (Integer key : salesTeam.keySet()) {
			SalesRep salesRep = salesTeam.get(key);
			totalTeam += salesRep.getSalesMade();
		}
	    return totalTeam * 0.03;
		// 0.03 * all sales made by team
   }
   public void addSalesRep(SalesRep rep) {
	   if(salesTeam.containsKey(rep.getRegistration())) {
		   salesTeam.put(rep.getRegistration(),rep);
	   }
   }
   public HashMap<Integer, SalesRep> getSalesTeam() {
	    return salesTeam;
	}

}
