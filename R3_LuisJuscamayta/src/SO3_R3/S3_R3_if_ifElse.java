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
public class S3_R3_if_ifElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean a = false;
        int b = 5;// If simple
        if (a) {
            System.out.println("hola");
        }//if else
        if (a) {
            System.out.println("ejecucion true");
        } else {
            System.out.println("ejecucion falsa");
        }
        if (b == 10) {
            System.out.println("b vale 10");
        } else if (b == 20) {
            System.out.println("b vale 20");
        } else if (b == 30) {
            System.out.println("b vale 30");
        } else {
            System.out.println("no Cumple");

        }
    }
}
