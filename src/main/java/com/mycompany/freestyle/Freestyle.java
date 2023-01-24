/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.freestyle;

/**
 *
 * @author puk
 */
public class Freestyle {

    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
    
    public static int fibonacci(int n){
   
	if (n == 0) {
		return 0;
	} else if (n == 1)  {
		return 1;
	} else {
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
    }
}
