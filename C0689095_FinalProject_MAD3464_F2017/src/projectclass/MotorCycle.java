/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectclass;

public class MotorCycle  extends Vehicle implements IPrintable
{
  
    String mBrand;
    double price;

    public String getmBrand() {
        return mBrand;
    }

    public void setmBrand(String mBrand) {
        this.mBrand = mBrand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MotorCycle(String mBrand, double price, String make, String model) {
        super(make, model);
        this.mBrand = mBrand;
        this.price = price;
    }
  
    public MotorCycle() {
        this.mBrand = "";
        this.price = 10000.0;
      
    }

    @Override
    public String printMyData() {
        return "\n Brand : " + this.getmBrand() + "\n Price: " + this.getPrice();
//To change body of generated methods, choose Tools | Templates.
    }
 
    
}
