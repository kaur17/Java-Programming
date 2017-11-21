/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectclass;


public class Intern extends Employee {
  String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
  
   public Intern()
   {
        super();
        this.schoolName = "";
       
    }
   
    public Intern(String schoolName, String name, int BirthYear, Vehicle v) 
    {
       
        this.schoolName = schoolName;
    }

//    public Intern(String schoolName, String name, int BirthYear) 
//    {
//       
//        this.schoolName = schoolName;
//    }

  @Override
    public String printMyData() {
        super.printMyData(); 
//To change body of generated methods, choose Tools | Templates.
//        System.out.println("School Name : " + schoolName);
      return "\n Name : " + getName() + "\n BirthYear : " + BirthYear() + "\n School Name : " + this.getSchoolName();
        
    }

    
}
