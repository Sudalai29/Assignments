package scratch;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
public class Employee {
	private String empId;
	private String empName;
	private double empSalary;
	
	Employee() {
	}
	
	Employee(Object obj) {
		if(obj instanceof LinkedHashMap) {
			Map<String,Object> myMap = (LinkedHashMap<String,Object>) obj;
			this.empId = (String) myMap.get("empId");
			this.empName = (String) myMap.get("empName");
			this.empSalary = (double) myMap.get("empSalary");
		}else {
			System.out.println("null values");
			return;
		}
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Object calculate() {
		double pf = 0.12*this.empSalary;
		double allowance = 0.15*this.empSalary;
		List<Double> myList = new LinkedList<>();
		myList.add(pf);
		myList.add(allowance);
		return myList;
	}
	public static void main(String args[]) {
		Map<String,Object> allValues = new LinkedHashMap<>();
		allValues.put("empID","CG101");
		allValues.put("empName", "Bruce wyane");
		allValues.put("empSalary", 50000d);
		
		Employee myEmployee = new Employee(allValues);
		List<Double> resultList = (List<Double>)myEmployee.calculate();
		
		System.out.println("ID :"+myEmployee.getEmpId());
		System.out.println("Name :"+myEmployee.getEmpName());
		System.out.println("Salary :"+myEmployee.getEmpSalary());
		System.out.println("PF :"+resultList.get(0));
		System.out.println("Allowance :"+resultList.get(1));
		
	}
	
}
