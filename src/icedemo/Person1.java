/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icedemo;

class Person1 extends Ice implements Topping1,Topping2 {
    
    int pricetotal1 = price+Price1+Price2;
    
    public void print(){
        System.out.println("@IcecreamShop");
        System.out.println("Icecream "+super.price+" bath/cone");
        System.out.println("Person1");
        this.print1();
        this.print2();
        
        System.out.println("price_total_person1 "+pricetotal1);
    }
    public void print1(){
        System.out.println("Topping is "+Top1+" Price is "+Price1+" Bath");
        
    }
    public void print2(){
        System.out.println("Topping is "+Top2+" Price is "+Price2+" Bath");
    }
}
