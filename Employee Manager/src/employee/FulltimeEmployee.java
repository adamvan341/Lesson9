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
public class FulltimeEmployee extends Employee{

    @Override
    public double getPay() {
        double pay = 0;
        // Overtime Pay
        if (hours > 40) {
            pay += (hours - 40) * (rate * 2);
            pay += 40 * rate;
        } else {
            pay = hours * rate;
        }
        totalPay += pay;
        return pay;
    }
    
}
