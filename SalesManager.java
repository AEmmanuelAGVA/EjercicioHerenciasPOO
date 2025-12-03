package herenciasJavaPOO;

import java.util.HashMap;

public class SalesManager extends SalesRep{
	private HashMap<Integer, SalesRep> salesTeam = new HashMap<>();
	
	public SalesManager(String firstName,String lastName,int registration,int age,int daysWorked
			,int vacationDayTaken,double salary,int yearsWorked, double salesMade){
		 super(firstName, lastName, registration, age, daysWorked, vacationDayTaken, salary, yearsWorked, salesMade);
		    
		    salesTeam = new HashMap<>();
	}
	public double calculateComission(){
	    double totalTeam = 0;
	    for (SalesRep rep : salesTeam.values()) {
			totalTeam += rep.getSalesMade();
		}
	    return totalTeam * 0.03;
		// 0.03 * all sales made by team
   }
   public void addSalesRep(int id, SalesRep rep) {
	   salesTeam.put(id,rep);
   }
   public HashMap<Integer, SalesRep> getSalesTeam() {
	    return salesTeam;
	}

}
