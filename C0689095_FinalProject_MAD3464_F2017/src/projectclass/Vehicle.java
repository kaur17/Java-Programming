/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectclass;


public class Vehicle implements IPrintable {

    String make;
    String model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle() {
        
        this.make = "";
        this.model = "";
    
    }
    
    
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public String printMyData() {
       return "\n Make : " + this.getMake() + "\n Model: " + this.getModel(); //To change body of generated methods, choose Tools | Templates.
    }
  
    
}
