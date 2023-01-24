/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.freestyle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author puk
 */
public class FreestyleTest {
    
    public FreestyleTest() {
    }
    
   @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Freestyle.main(args);
    }

    @Test 
    public void testFibonacci(){
        //App test = new App();
        Freestyle instance = new Freestyle();
	assertTrue(instance.fibonacci(1) == 1);
    }
    @Test	
    public void testFibonacci2(){
	//App test = new App();
        Freestyle instance = new Freestyle();
        assertTrue(instance.fibonacci(10) == 55);
    }
    
}