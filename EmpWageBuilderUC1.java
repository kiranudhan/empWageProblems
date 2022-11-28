package empwageproblems;
//Check Employee is Present and Absent
public class EmpWageBuilderUC1 {
	public static void main(String[] args) {
		int IS_FULL_TIME=1;
		int empCheck= (int) (Math.floor(Math.random() * 10) % 2);
		System.out.println(empCheck);
		if(empCheck==IS_FULL_TIME) {
			System.out.println("Employee is present");
		}else {
			System.out.println("Employee is absent");
		}
	}
}
