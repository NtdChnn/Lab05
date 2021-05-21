 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

import java.util.Scanner;

/**
 *
 * @author notda
 */
public class Exercise {
    public static void main(String[] args) {
        Account Ex01 = new Account(1122,20000);
        Ex01.setAnnualInterestRate(4.5);
        
        System.out.println("ID : " + Ex01.getId());
        System.out.println("Balance : " + Ex01.getBalance());
        
        System.out.print("Enter withdraw : ");
        Scanner withdrawInput = new Scanner(System.in);
        double withdraw = withdrawInput.nextDouble();
        Ex01.withdraw(withdraw);
        
        System.out.print("Enter deposit : ");
        Scanner depositInput = new Scanner(System.in);
        double deposit = depositInput.nextDouble();
        Ex01.deposit(deposit);
        
        System.out.println("Monthly interest : " + Ex01.getMonthlyInterest());
        System.out.println("Date when this account was created : " +Ex01.getDateCreated());
    }
}
