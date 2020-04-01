/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pishi
 */
public class Ice4Test {
    
    public Ice4Test() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of main method, of class Ice4.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ice4.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iteration method, of class Ice4.
     */
    @Test
    public void testIteration() {
        System.out.println("iteration");
        char letter = ' ';
        String word = "";
        int expResult = 0;
        int result = Ice4.iteration(letter, word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of occurrences method, of class Ice4.
     */
    @Test
    public void testOccurrences() {
        System.out.println("occurrences");
        char firstLetter = ' ';
        char secondLetter = ' ';
        String word = "";
        char expResult = ' ';
        char result = Ice4.occurrences(firstLetter, secondLetter, word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specified method, of class Ice4.
     */
    @Test
    public void testSpecified() {
        System.out.println("specified");
        char letter = ' ';
        String word = "";
        boolean expResult = false;
        boolean result = Ice4.specified(letter, word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
