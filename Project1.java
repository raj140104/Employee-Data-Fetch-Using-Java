
/** Ritesh Raj_22BCS80149
	
	Project 1 : Employee Detail 
**/

package project1;

import java.util.Scanner;

	class Employee {
	  int empNo;
	  String empName;
	  String joinDate;
	  char desigCode;
	  String dept;
	  int basic;
	  int hra;
	  int it;
	
	  public Employee(int empNo, String empName, String joinDate, char desigCode, String dept, int basic, int hra, int it) {
	    this.empNo = empNo;
	    this.empName = empName;
	    this.joinDate = joinDate;
	    this.desigCode = desigCode;
	    this.dept = dept;
	    this.basic = basic;
	    this.hra = hra;
	    this.it = it;
	  }

	  public int getEmpNo() {
	    return empNo;
	  }
	
	  public String getEmpName() {
	    return empName;
	  }
	  
	  public char getDesigCode() {
		    return desigCode;
		  }
	  public String getDept() {
	    return dept;
	  }
	
	  public int getSalary() {
	    int da = 0;
	    switch (desigCode) {
	      case 'e':
	        da = 20000;
	        break;
	      case 'c':
	        da = 32000;
	        break;
	      case 'k':
	        da = 12000;
	        break;
	      case 'r':
	        da = 15000;
	        break;
	      case 'm':
	        da = 40000;
	        break;
	      default:
	        da = 0;
	        break;
	    }
	    return basic + hra + da - it;
	  }
	
	  public String getDesignation() {
	    String desig = "";
	    switch (desigCode) {
	      case 'e':
	        desig = "Engineer";
	        break;
	      case 'c':
	        desig = "Consultant";
	        break;
	      case 'k':
	        desig = "Clerk";
	        break;
	      case 'r':
	        desig = "Receptionist";
	        break;
	      case 'm':
	        desig = "Manager";
	        break;
	      default:
	        desig = "Unknown";
	        break;
	    }
	    return desig;
	  }
	}

public class Project1 {

	  public static void main(String[] args) {
		  
	    //Initialize the array
	    Employee[] employees = new Employee[7];
	    employees[0] = new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D",   	     20000, 8000,  3000);
	    employees[1] = new Employee(1002, "Sushma", "23/08/2012", 'c', "PM",    	     30000, 12000, 9000);
	    employees[2] = new Employee(1003, "Rahul",  "12/11/2008", 'k', "Acct",           10000, 8000,  1000);
	    employees[3] = new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 	 12000, 6000,  2000);
	    employees[4] = new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 		     50000, 20000, 20000);
	    employees[5] = new Employee(1006, "Suman",  "1/1/2000",    'e', "Manufacturing", 23000, 9000,  4400);
	    employees[6] = new Employee(1007, "Tanmay", "12/06/2006",  'c', "PM",            29000, 12000, 10000);
	
	    //Create a scanner object to read input from the command prompt
	    Scanner sc = new Scanner(System.in);
	
	    System.out.println("Enter the Employee Id: ");
	    int empId = sc.nextInt();
	    sc.close();
	
	    // Find the employee with the given id in the array
	    Employee emp = null;
	    for (int i=0; i<employees.length; i++) {
	      if (employees[i].getEmpNo() == empId) {
	        emp = employees[i];
	        break;
	      }
	    }
	
	    if (emp == null) { 
	      System.out.println("No Employee with empid: " + empId);
	    } else { 
	      System.out.println("Emp No. Emp Name Department Designation Salary");
	      System.out.println(emp.getEmpNo() + " " + emp.getEmpName() + " " + emp.getDept() + " " + emp.getDesignation() + " " + emp.getSalary());
	    }
	  }
	}