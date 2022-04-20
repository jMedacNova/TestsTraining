/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jubed
 */
public class OperationsTest {
    
    public OperationsTest() {
    }

    /**
     * Test of newNumber method, of class Operations.
     */
    @Test
    public void testCurrentOperationsArrayIsNotNullWhenCreateOperations() {
        Operations op = new Operations();
        
        assertNotNull(op.currentOperation);
    }
    
    @Test
    public void testLenOfCurrentOperationArray() {
        Operations op = new Operations();
        
        op.newNumber(2);
                
        assertEquals(op.currentOperation.size(),1);
        
        op.newNumber(16);
        
        assertEquals(op.currentOperation.size(),2);
        
    }

    
    /**
     * Test of add method, of class Operations.
     */
    @Test
    public void testAddSumaCorrectamenteConVariosSumandos() {
        //1. Preparar la prueba
        Operations op = new Operations();
        
        op.newNumber(2);
        op.newNumber(452);
        op.newNumber(364);
                        
        //2. Probar
        int result = op.add();
        
        //3. Comprobar
        assertEquals(2+452+364, result);
        
        //1. Preparar la prueba
        
        op.newNumber(4);
        op.newNumber(26);
        op.newNumber(12);
                        
        //2. Probar
        result = op.add();
        
        //3. Comprobar
        assertEquals(4+26+12, result);
        
        //1. Preparar la prueba
        
        op.newNumber(60);
        op.newNumber(21);
        op.newNumber(104);
                        
        //2. Probar
        result = op.add();
        
        //3. Comprobar
        assertEquals(60+21+10, result);
        
    }
    
    @Test
    public void testAddNoSumaSiNoHaySumandos() {
        //1. Preparar la prueba
        Operations op = new Operations();
                                
        //2. Probar
        int result = op.add();
        
        //3. Comprobar
        assertEquals(0, result);
    }
    
}
