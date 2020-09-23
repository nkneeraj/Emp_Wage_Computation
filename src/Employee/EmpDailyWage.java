package Employee;

public class EmpDailyWage {
	public static void main(String[] args) {
		int Is_Full_Time = 1;
		int Emp_Rate_per_Hour = 20;

		int EmpHrs = 0;
		int EmpWage = 0;

		double EmpCheck = Math.floor(Math.random()*10)%2;
		if(EmpCheck== Is_Full_Time)
			EmpHrs = 8;
		else
			EmpHrs = 0;
		EmpWage = EmpHrs* Emp_Rate_per_Hour;
		System.out.println("Emp Wage:" + EmpWage);

	}
}
