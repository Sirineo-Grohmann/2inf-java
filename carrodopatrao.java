/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package O_ultimo_homem;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class carrodopatrao {
      public static void main(String[] args){
    Scanner entrada = new Scanner (System.in);
      
      /*carros*/
      int quantcarro = 0;
      /*salario*/
      int
      salario = 0;
      
      System.out.println("Quantos carros vendeu?");
      quantcarro = entrada.nextInt();
      
        if(quantcarro <=5){

        salario = ((quantcarro*500)+1000);
        System.out.println("Vendeu "+quantcarro+"carros e seu salario foi de R$:"+salario);

        }
         if(quantcarro > 5){

        salario = ((quantcarro*1000)+1000);
        System.out.println("Vendeu "+quantcarro+"carros e seu salario foi de R$:"+salario);

        } 
      }
}
