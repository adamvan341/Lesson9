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
public abstract class Employee {

    // Instance Variables
    protected int hours;
    protected double rate;
    protected String name;

    // Class Constants
    static double MIN_RATE = 6.75;
    static double MAX_RATE = 30.50;
    static int MIN_HOURS = 1;
    static int MAX_HOURS = 60;

    // Classwide Variables
    static double totalPay = 0;

    public boolean setName(String name) {
        if (name.charAt(0) == '0' || name.charAt(0) == '1'
                || name.charAt(0) == '2'
                || name.charAt(0) == '3'
                || name.charAt(0) == '4'
                || name.charAt(0) == '5'
                || name.charAt(0) == '6'
                || name.charAt(0) == '7'
                || name.charAt(0) == '8'
                || name.charAt(0) == '9') {
            return false;
        }
        this.name = name;
        return true;
    }

    public boolean setRate(double rate) {
        if (rate > MAX_RATE || rate < MIN_RATE) {
            return false;
        } else {
            this.rate = rate;
            return true;
        }
    }

    public boolean setHours(int hours) {
        if (hours > MAX_HOURS || hours < MIN_HOURS) {
            return false;
        } else {
            this.hours = hours;
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public abstract double getPay();

    public static String getNameRules() {
        return "Name must not start with a number (0-9)";
    }

    public static String getRateRules() {
        return "Rate must not be lower than " + MIN_RATE + " or higher than " + MAX_RATE;
    }

    public static String getHoursRules() {
        return "Hours must not be less than " + MIN_HOURS + " or higher than " + MAX_HOURS;
    }

    public static double getTotalPay() {
        return totalPay;
    }

}
