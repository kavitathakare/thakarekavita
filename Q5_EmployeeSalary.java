//Java program to increase employee salary by percentage.

package Java;

public class Q5_EmployeeSalary {

	    int id;
	    String name;
	    double salary;
	
	    // creating parameterized constructor.
	public Q5_EmployeeSalary(int id, String name, double salary) {
		
		// Using this keyword.
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	   	public void increaseSalary(double percent) {
		
		double increasePercent = (percent / 100) * salary;
		salary = salary + increasePercent;
	}
	
	    // creating method to display1 previous salary.
	public void display() {
		
		System.out.println(" employee salary :");
		System.out.println("\n Employee id is : "+id+"\n Employee name is : "+name+"\n  Salary is : "+salary);
	}
	
	    // creating method to display2 increment salary.
	public void display1() {
	
		System.out.println("\nIncrement in employee salary  :");
		System.out.println("\n Employee id is : "+id+"\n Employee name is : "+name+"\n Increase Salary is : "+salary);
	    
 }
	
	public static void main(String[] args) {
		
		Q5_EmployeeSalary w = new Q5_EmployeeSalary(1, "kavita", 50000);
		
		// calling methods through constructor objects.
		w.display();
		w.increaseSalary(10.0);
		w.display1();
		
	}

}
output:
/* employee salary :

 Employee id is : 1
 Employee name is : kavita
  Salary is : 50000.0
Increment in employee salary  :

Employee id is : 1
Employee name is : Ayushi
Increase Salary is : 55000.0*/