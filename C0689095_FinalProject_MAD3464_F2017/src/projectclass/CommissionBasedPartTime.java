/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectclass;

public class CommissionBasedPartTime extends PartTime implements IPrintable {
    private int CommissionAmount;
    
    public CommissionBasedPartTime(int CommissionAmount, int hourlyRate, int numberHoursWorked, String name, int BirthYear, Vehicle v) 
    {
        super(hourlyRate, numberHoursWorked, name, BirthYear, v);
        this.CommissionAmount = 150;
    }
    
    
   
  public CommissionBasedPartTime()
    {
        super();
        this.CommissionAmount = 0;
      
    }

    

    @Override
    public double calcEarnings() 
    {
        return (double)((this.getNumberHoursWorked() * this.getHourlyRate()) + CommissionAmount);
//To change body of generated methods, choose Tools | Templates.
    }

    public int getCommissionAmount()
    {
        return CommissionAmount;
    }

    public void setCommissionAmount(int CommissionAmount) 
    {
        this.CommissionAmount = CommissionAmount;
    }
    
    
    
    
  
    
}
