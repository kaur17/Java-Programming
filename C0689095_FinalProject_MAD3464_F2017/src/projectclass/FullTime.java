/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectclass;

public class FullTime extends Employee implements IPrintable
        
{

   private int Salary;
    private int Bonus;
    
    public int getSalary()
    {
       return Salary;
    }
    public void setSalary()
    {
        this.Salary = Salary;
    }
  public int getBonus()
    {
       return Bonus;
    }
    public void setBonus()
    {
        this.Bonus = Bonus;
    }
 
    public FullTime(int Salary, int Bonus, String name, int age)
    {
        super(name, age);
        this.Salary = Salary;
        this.Bonus = Bonus;
    }

    public FullTime(int Salary, int Bonus) 
    {
        this.Salary = Salary;
        this.Bonus = Bonus;
    }

    
    public FullTime(int Salary, int Bonus, String name, int BirthYear, Vehicle v) 
    {
        super(name, BirthYear, v);
        this.Salary = Salary;
        this.Bonus = Bonus;
    }
    
       public FullTime() {
        
        super();
        this.Salary = 0;
        this.Bonus = 0;
       
    }

    
    @Override
    public double calcEarnings()

{
      
       return (double)(getSalary() + getBonus());
      
    }

    @Override
    public String printMyData() {
        super.printMyData();
       //To change body of generated methods, choose Tools | Templates.
//        System.out.println("Salary : " + Salary);
//        System.out.println("Bonus : " + Bonus);
        return "\n Name : " + getName() + "\n BirthYear : " + BirthYear()+ "\n Salary : " + getSalary() + "\n Bonus : "+ getBonus();
       
     
    }

    
   
    
 
}
