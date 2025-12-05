package herenciasJavaPOO;

public class Main {

    public static void main(String[] args) {
    	
        Employee emp = new Employee(
            "Emmanuel", "Aguilar", 100, 30, 364, 7, 15000, 0,"Emma01","Chila89"
        );
        
        SalesRep rep1 = new SalesRep(
				"Fernando", "Aguilar", 200, 33, 642, 14, 12000, 5, 50000,"Fer02","Hera87"
        );

        SalesRep rep2 = new SalesRep(
            "Juan", "Valencia", 201, 58, 486, 10, 13000, 4, 80000,"Juan03","Hati56"
        );

        SalesManager manager = new SalesManager(
            "Nancy", "Moreno", 300,35, 1025, 25, 25000, 15, 0,"Nan54","Zeus44"
        );
        
        manager.addSalesRep( rep1);
        manager.addSalesRep( rep2);

        System.out.println("Tiempo para retirarse de "+emp.getFirstName()+" es: " + emp.timeToRetirement());
        System.out.println("Vacaciones restantes de "+emp.getFirstName()+" es: " + emp.vacationTimeLeft());
        System.out.println("Bono de "+emp.getFirstName()+" es: " + emp.calculateBonus());
        
        System.out.println("Comisión de : "+rep1.getFirstName()+" es: " + rep1.calculateComission());
        System.out.println("Comisión de : "+rep2.getFirstName()+" es: " + rep2.calculateComission());
    
        System.out.println("Comisión de : "+manager.getFirstName()+" es: " + manager.calculateComission());
    
        System.out.println(rep1.getFirstName());   // heredado de Employee
        System.out.println(manager.getLastName()); // heredado de Employee
        System.out.println(manager.calculateComission()); // heredado Y sobrescrito

        System.out.println(manager.getSalesTeam().size());
        
        boolean correcto = emp.login("Emma01", "Chila89");
        System.out.println("El usuario es: "+correcto);
        boolean falso = emp.login("Juan03", "Hati56");
        System.out.println("El usuario es: "+falso);
    }
}