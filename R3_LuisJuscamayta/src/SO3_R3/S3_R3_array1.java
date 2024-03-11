/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SO3_R3;

/**
 *
 * @author luisj
 */
public class S3_R3_array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[5];

        numeros[0] = 100;
        numeros[1] = 200;
        numeros[2] = 500;
        numeros[3] = 1000;
        numeros[4] = 1500;
        System.out.println(numeros[3]);

        int[] numeros2 = {10, 20, 30, 40, 50, 60};
        System.out.println(numeros2[2]);
        for (int numero : numeros2) {
            System.out.println(numero);
        }

    }

}
