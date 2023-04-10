/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.issiah;

/**
 *
 * @author malware
 */
public class Issiah {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
 class Utility{
        protected double water;
        protected double electricity;
       
        public Utility(){
        water = 0;
        electricity = 0;
        }
        public Utility(double water ,double electricity){
           this.water = water;
           this.electricity = electricity;
        }
        
        public double getWater(){
         return water;
        }
        
        public double getElectricity(){
          return electricity;
        }
        public double waterBill(){
            if (water <= 500) {
                return 0.0;   
            }
            else{
                return  (water - 500)*1.05;
            }
        }
       
    }
class myBill extends Utility{
     public myBill(){
     super(0,0);
     }
     public myBill(double water, double electricity){
     this.electricity = electricity;
     this.water = water;   
     }
     public double electricityBill(){

        if (electricity <= 50){
             return 0.0;
         } else if (electricity > 50) {
             return (electricity - 50)*2.5;
         } else if(electricity > 100)   {
             return (50 * 5.7)+ (electricity - 50);
         }
        return (0);
     }
     public double totalBill(){
         return  electricityBill() + waterBill();
     }
}