/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icedemo;


public class Person2 extends Ice implements Topping1,Topping3 {
    
    int pricetotal2 = price+Price1+Price3;
    
    public  void print(){
        System.out.println("@IcecreamShop");
        System.out.println("Icecream "+super.price+" bath/cone");
        System.out.println("Person2");
        this.print1();
        this.print3();
        System.out.println("price_total_person2 "+pricetotal2);
        
    }
        public void print1(){
            System.out.println("Topping is "+Top1+" Price is "+Price1+" Bath");
        }
        public void print3(){
            System.out.println("Topping is "+Top3+" Price is "+Price3+" Bath");
        }
}
