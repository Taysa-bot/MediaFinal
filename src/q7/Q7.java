/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q7;

import java.util.Scanner;

/**
 *
 * @author 20181094010025
 */
public class Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int escola[][] = new int[5][4];
        int j = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe sua matrícula");
            escola[i][j] = sc.nextInt();
            System.out.println("Informe a média das suas notas da provas");
            escola[i][j + 1] = sc.nextInt();
            System.out.println("Informe a média das suas notas dos trabalhos");
            escola[i][j + 2] = sc.nextInt();
            escola[i][j + 3] = escola[i][j + 1] + escola[i][j + 2];
        }
        int maior = 0;
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            if (escola[i][3] > maior) {
                maior = escola[i][3];
                cont = i;
            }
        }
        System.out.println("Maior nota : "+maior);
        System.out.println("Matrícula : "+escola[cont] [j]);
        System.out.println("Média das notas finais : "+(escola[0][3]+escola[1][3]+escola[2] [3]+escola[3] [3]+escola [4] [3])/5);
    }

}
