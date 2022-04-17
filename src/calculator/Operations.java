/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

import java.util.ArrayList;

/**
 *
 * @author jubed
 */
public class Operations {
    ArrayList currentOperation = new ArrayList();
    ArrayList operationsHistory = new ArrayList();

    public void newNumber(int newNumber){
        this.currentOperation.add(newNumber);
    }      
    
    public int add(){
        int result = 0;
        for (int iNumber = 0; iNumber <this.currentOperation.size(); iNumber++){
            result += (int)this.currentOperation.get(iNumber);
        }
        
        this.currentOperation.add(result);
        this.operationsHistory.add(this.currentOperation.clone());
        this.currentOperation.clear();
        
        return result;
    }
    
    
}
