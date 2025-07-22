/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesBean;

/**
 *
 * @author Matias
 */
public class Prueba {
     public static void main(String[] args) {
        System.out.print("***");
         int i, j;
         System.out.println("Como me gusta la karen");
        for (i = 0; i < 6; i++) {
            for (j = 0; j <= 6; j++) {
                if ((i == 0 && j % 3 != 0) ||
                    (i == 1 && j % 3 == 0) ||
                    (i - j == 2) || (i + j == 8))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
