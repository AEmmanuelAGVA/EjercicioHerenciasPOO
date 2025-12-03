package herenciasJavaPOO;

public class Employee {
	private String firstName;
	private String lastName;
	private int registration;
	private int age;
	private int daysWorked;
	private int vacationDayTaken;
	private double salary;
	private int yearsWorked;
	
   public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDayTaken,
			double salary, int yearsWorked) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDayTaken = vacationDayTaken;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	}
   public int timeToRetirement(){
	   return Math.min((60-this.age),(40-this.yearsWorked));
		   // time to retirement = min(60 - age, 40 - yearsWorked)
   }

   public double vacationTimeLeft(){
	   return ((this.daysWorked/360.0)*(30-this.vacationDayTaken));
	   	// vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
   }

   public double calculateBonus(){
	   return 2.2*this.salary; 
		 // bonus = 2.2*salary
   }

   public String getFirstName() {
	return firstName;
   }

   public void setFirstName(String firstName) {
	this.firstName = firstName;
   }

   public String getLastName() {
	return lastName;
   }

   public void setLastName(String lastName) {
	this.lastName = lastName;
   }

   public int getRegistration() {
	return registration;
   }

   public void setRegistration(int registration) {
	this.registration = registration;
   }

   public int getAge() {
	return age;
   }

   public void setAge(int age) {
	this.age = age;
   }

   public int getDaysWorked() {
	return daysWorked;
   }

   public void setDaysWorked(int daysWorked) {
	this.daysWorked = daysWorked;
   }

   public int getVacationDayTaken() {
	return vacationDayTaken;
   }

   public void setVacationDayTaken(int vacationDayTaken) {
	this.vacationDayTaken = vacationDayTaken;
   }

   public double getSalary() {
	return salary;
   }

   public void setSalary(double salary) {
	this.salary = salary;
   }

   public int getYearsWorked() {
	return yearsWorked;
   }

   public void setYearsWorked(int yearsWorked) {
	this.yearsWorked = yearsWorked;
   }
   
}
