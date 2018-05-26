/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sturkturdata;
import java.util.Scanner;
/**
 *
 * @author Ade
 */
public class SturkturData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
    int B[] = {2, 1, 6, 9, 4, 3};
    int jumlah = B[0];
    int max1 = 0;
    int max2 = 0;
    for (int b : B) {
    if (b > max1) {
        max2 = max1;
        max1 = b;
    }
    else if (b > max2 && b < max1)
        max2 = b;
    }
        System.out.println(max2 + " adalah bilangan terbesar kedua setelah bilangan " + max1);
    }
     


}
