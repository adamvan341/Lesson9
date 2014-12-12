/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author adam
 */
public class ParttimeEmployee extends Employee {

    @Override
    public double getPay() {
        double pay = rate * hours;
        totalPay += pay;
        return rate * hours;
    }
    
}
