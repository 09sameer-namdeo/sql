package sam;

public class Employee {
	private int emp_id;
	private String name;
	public Employee(int emp_id, String name, String email, int salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	private String email;
	private int salary;

}
