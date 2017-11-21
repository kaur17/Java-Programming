/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectclass;
import java.util.ArrayList;

public class Employee implements IPrintable{
    
  private String name;
  private int BirthYear;
  private Vehicle v;
  private static ArrayList<Employee> employeeList = new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return BirthYear;
    }

    public void setBirthYear(int BirthYear) {
        this.BirthYear = BirthYear;
    }

    public Vehicle getV() {
        return v;
    }

    public void setV(Vehicle v) {
        this.v = v;
    }

    public static ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public static void setEmployeeList(ArrayList<Employee> employeeList) {
        Employee.employeeList = employeeList;
    }
  
  
  
    public Employee(String name, int BirthYear) {
        this.name = name;
        this.BirthYear = BirthYear;
    }

    public Employee(String name, int BirthYear, Vehicle v) {
        this.name = name;
        this.BirthYear = BirthYear;
        this.v = v;
    }

  

  public Employee()           //constructor///
  {
   this.name = "";
   this.BirthYear = 0;
   v = null;
      
  }  
    
   public double calcEarnings(){
      return 1000.00;
       
       
   }
   
   public int BirthYear()
   {
       return 2017 - this.BirthYear;
   }
   
   public static void addemployee(Employee emp)
   {
       employeeList.add(emp);
   }
  @Override
   public String printMyData(){
//       System.out.println("Name : " + name);
//       System.out.println("Age : " + age);
      return "\n Name : " + this.getName() + "\n BirthYear : " + this.getBirthYear();
       
   }

//    void printMyData() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    
    
    
}
