/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movilesxd;

/**
 *
 * @author adolf
 */
import java.util.Scanner;

public class Movilesxd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe un numero enetero: ");
        int numero = scanner.nextInt();

        String resultado = "";

        int[] numEnteros =    {1000, 900, 500, 400, 100, 90,  50,  40,  10, 9,   5,  4,   1};
        String[] numRomanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < numEnteros.length; i++) 
        {
            while (numero >= numEnteros[i]) 
            {
                numero -= numEnteros[i];
                resultado += numRomanos[i];
            }
        }
        System.out.println("En número romano es: " + resultado);
    }
}