package prototype;

import java.util.List;

/**
 * @author Pooja Mantri
 *
 */
public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees employee = new Employees();
		employee.loadData();

		Employees employeeClone1 = (Employees) employee.clone();
		Employees employeeClone2 = (Employees) employee.clone();
		
		List<String> clone1List = employeeClone1.getEmployees();
		clone1List.add("E");
		List<String> clone2List = employeeClone2.getEmployees();
		clone2List.remove("B");

		System.out.println("Employee List: " + employee.getEmployees());
		System.out.println("Clone 1 List: " + clone1List);
		System.out.println("Clone 2 List: " + clone2List);
	}

}