/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectclass;

import java.util.ArrayList;

/**
 *
 * @author macstudent
 */
public class ProjectClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
//        PartTime pt = new PartTime(120, 5, "Navjot", 23);
//        pt.calcEarnings();
//        System.out.println(pt.calcEarnings());
//        pt.printMyData();
//        System.out.println(pt.printMyData());

        double payroll = 0.0;
        
        
        
       Car car1 = new Car("Ford", "White" , "1998" ,"2000" );
       
       MotorCycle mc1 = new MotorCycle("Honda",20000,"1997","2012");
     
       FullTime ft1 = new FullTime(20000, 30, "Navjot Kaur", 22,car1);
       Employee.addemployee(ft1);
     
       PartTime pt1 = new PartTime(12,10,"Payal",24,mc1);
       Employee.addemployee(pt1);
        
       CommissionBasedPartTime cpt1 = new CommissionBasedPartTime(10,23,15,"Indravadan",24,car1);
       Employee.addemployee(cpt1);
      
       FullTime ft2 = new FullTime(23000, 120,"Kirti ", 25);
       Employee.addemployee(ft2);
       
       
ArrayList<Employee> employeeList = new ArrayList<>(Employee.getEmployeeList());


for(Employee employeeList1 : employeeList)
{
  Employee emp = (Employee) employeeList1;
   System.out.println("****************");
 
    
    Vehicle v = new Vehicle();
    v = employeeList1.getV();
    
    if( v == null)
    {
        System.out.println("Employee has no Vehicle");
    }
    else 
    {
        if( v instanceof Car)
        {
            System.out.println("Employee has a Car");
        }
        else if( v instanceof MotorCycle)
        {
            System.out.println("Employee has a MotorCycle");
        }
    }
    
  
   System.out.println(emp.printMyData());
   
   payroll += emp.calcEarnings();
     System.out.println("\n Total Pay: " + payroll);
}


}
}