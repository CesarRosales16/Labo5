/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo5;

import java.util.InputMismatchException;

/**
 *
 * @author UCA
 */
public class VerificadorMeta {

    
    private static VerificadorMeta instance;
    private static boolean[] estado = {false, false, false};

  
    public synchronized static VerificadorMeta getInstance() {
        if (instance == null) {
            instance = new VerificadorMeta();
        }
        return instance;
    }

}
