/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jubed
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Operations math = new Operations();
        
        // entrada de una cadena
        while (true){
            System.out.println("=====================================");
            System.out.println("Nueva Suma");
            System.out.println("Introduce un nuemro a sumar");
            System.out.println("Introduce = para calcular el resultado");
            
            while (true){
                String data = sc.nextLine();

                if (data.equals("=")){
                    int sum = math.add();
                    System.out.println("El resultado de la suma es: " + sum);
                    break;
                }else{
                    math.newNumber(Integer.parseInt(data));
                }   
            }
        }        
    }
    
}
