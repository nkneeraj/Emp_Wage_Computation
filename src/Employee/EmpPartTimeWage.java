package Employee;

public class EmpPartTimeWage {
	public static void main(String[] args) {
		
		int Is_Part_Time = 1;
		int Is_Full_Time = 2;
		int Emp_Rate_Per_Hour = 20;
		int EmpHrs = 0;
		int EmpWage = 0;
		
		double EmpCheck = Math.floor(Math.random()*10)%3;
		if(EmpCheck == Is_Part_Time)
			EmpHrs = 4;
		else if (EmpCheck == Is_Full_Time)
			EmpHrs =8;
		else
			EmpHrs = 0;
		EmpWage = EmpHrs * Emp_Rate_Per_Hour;
		System.out.println("Emp Wage: "+EmpWage);
		
	}

}
