/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectclass;


public class PartTime extends Employee implements IPrintable
{
  
   private int hourlyRate;
    private int numberHoursWorked;
    
    
    public PartTime(int hourlyRate, int numberHoursWorked, String name, int age, Vehicle v)
    {
        super(name, age, v);
        this.hourlyRate = hourlyRate;
        this.numberHoursWorked = numberHoursWorked;
    }

    public PartTime(int hourlyRate, int numberHoursWorked, String name, int age) 
    {
        super(name, age);
        this.hourlyRate = hourlyRate;
        this.numberHoursWorked = numberHoursWorked;
    }
  
    
    
    public PartTime(int hourlyRate, int numberHoursWorked)
    {
        this.hourlyRate = hourlyRate;
        this.numberHoursWorked = numberHoursWorked;
    }

    public PartTime() 
    {
        
        super();
        this.hourlyRate = 0;
        this.numberHoursWorked = 0; 
      
    }
      public int getHourlyRate()
      {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) 
    {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberHoursWorked() 
    {
        return numberHoursWorked;
    }

    public void setNumberHoursWorked(int numberHoursWorked) 
    {
        this.numberHoursWorked = numberHoursWorked;
    }
    
    @Override
    public double calcEarnings()
    {
        return (double)(getNumberHoursWorked() * getHourlyRate());
    
}

    @Override
    public String printMyData() 
    {
        super.printMyData(); //To change body of generated methods, choose Tools | Templates.
        
//       s
        return "\n Name : " + this.getName() + "\n BirthYear : " + this.BirthYear()+ "\n Rate : " + this.getHourlyRate() + "\n" + "HoursWorked : " + this.getNumberHoursWorked();
       
    }
   
    
    
    
    
  
  
}
