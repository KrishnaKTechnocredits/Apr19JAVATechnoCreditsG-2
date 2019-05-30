//Employee having max salary

package navjeetK;

import java.util.Scanner;

public class Employee1 {

	String empName;

	int deptId;

	double salary;

	Employee1(String empName, int deptId, double salary) {
		this.empName = empName;

		this.deptId = deptId;

		this.salary = salary;
	}

	void compareEmpSalary(Employee1 e1, Employee1 e2) {

		if (e1.salary > e2.salary) {
			System.out.println("Salray of Employee 1 is greater than Employee 2");

			System.out.println("Employee Name : " + e1.empName + " Employee Dept : " + e1.deptId + " Employee Salary : "
					+ e1.salary);
		} else {
			System.out.println("Salray of Employee 2 is greater than Employee 1");

			System.out.println("Employee Name : " + e2.empName + " Employee Dept : " + e2.deptId + " Employee Salary : "
					+ e2.salary);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("--------Enter Employee Details-------- ");

		Employee1[] e = new Employee1[2];

		for (int i = 0; i < e.length; i++) {

			System.out.print("Enter Employee name: ");

			String empName = sc.next();

			System.out.print("Enter Department id: ");

			int deptId = sc.nextInt();

			System.out.print("Enter Emplotyee Salary: ");

			double salary = sc.nextDouble();

			e[i] = new Employee1(empName, deptId, salary);

		}

		/*
		 * for (int j=0;j<arr1.length;j++) {
		 * System.out.println("Employee Name : " + arr1[j].empName +
		 * "Employee Dept : " + arr1[j].deptId + "Employee Salary : " +
		 * arr1[j].salary); }
		 */

		Employee1 e1 = new Employee1(e[0].empName, e[0].deptId, e[0].salary);

		Employee1 e2 = new Employee1(e[1].empName, e[1].deptId, e[1].salary);

		// e1.compareEmpSalary(arr1[0],arr1[1]);

		e1.compareEmpSalary(e1, e2);

	}
}
