
package projectclass;

public class FixedBasedPartTime extends PartTime implements IPrintable
{
     private int FixedAmount;
     
     
     
     public int getFixedAmount() {
        return FixedAmount;
    }

    public void setFixedAmount(int FixedAmount) {
        this.FixedAmount = FixedAmount;
    }
    
    public FixedBasedPartTime() 
    {
        super();
        this.FixedAmount = 0;
        
    }
    
  
  
    public FixedBasedPartTime(int hourlyRate, int numberHoursWorked, String name, int BirthYear, Vehicle v) 
    
    {
        super(hourlyRate, numberHoursWorked, name, BirthYear, v);
        this.FixedAmount = 200;
        
    }

    @Override
    public double calcEarnings() {
        return (double)((this.getHourlyRate() * this.getNumberHoursWorked()) + FixedAmount); //To change body of generated methods, choose Tools | Templates.
    
    }

    
    
}
