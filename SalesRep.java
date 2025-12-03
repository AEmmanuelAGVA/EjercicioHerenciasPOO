package herenciasJavaPOO;

public class SalesRep extends Employee{
	private double salesMade;
	
	public SalesRep(String firstName,String lastName,int registration,int age,int daysWorked
			,int vacationDayTaken,double salary,int yearsWorked, double salesMade) {
		super(firstName,lastName,registration,age,daysWorked,vacationDayTaken,salary,yearsWorked);
		this.salesMade = salesMade;
	}
	
   public double calculateComission(){
	   return 0.01 * this.salesMade;
   }

   public double getSalesMade() {
	return salesMade;
   }

   public void setSalesMade(double salesMade) {
	this.salesMade = salesMade;
   }
   
}
