/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectclass;

public class Car extends Vehicle implements IPrintable
{
    
    String Brand;
    String Color;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    public Car(String Brand, String Color, String make, String model) {
        super(make, model);
        this.Brand = Brand;
        this.Color = Color;
    }

 
    public Car() {
    super();
    this.Brand = "";
    this.Color = "";
    
    }

    @Override
    public String printMyData() {
       return "\n Brand :" + this.getBrand() + "\n Model :" + this.getColor();
       //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
