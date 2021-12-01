package e;

public class Emp implements Comparable <Emp>{

	int empId;
	String empName;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public String toString() {
		return empId+empName;
	}
	@Override
	public int compareTo(Emp e) {
		//return e.getEmpId()-this.empId;
		return this.empName.compareTo(e.getEmpName());
	}
	
}
