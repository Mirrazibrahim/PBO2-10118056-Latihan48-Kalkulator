/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan48.kalkulator;

/**
 *
 * @author 
 * Nama : Mirraz Ibrahim
 * Nim : 10118056
 * Kelas: IF-2

 */
public class PBO210118056Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kalkulator=new Kalkulator();
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        
        double val1 = kalkulator.getValue1();
        double val2 = kalkulator.getValue2();
        
        System.out.println("VALUE 1 : " + kalkulator.getValue1());
        System.out.println("VALUE 2 : " + kalkulator.getValue2());
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you hoe to manage method in java");
        System.out.println("Resuls Add is : " + kalkulator.add(val1, val2));
        System.out.println("Resuls Minus is : " + kalkulator.minus(val1, val2));
        System.out.println("Resuls Multiple is : " + kalkulator.multiplication(val1, val2));
        System.out.println("Resuls Division is : " + kalkulator.division(val1, val2));
    }
    
}
