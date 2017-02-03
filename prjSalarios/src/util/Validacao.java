/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Date;

/**
 *
 * @author diorgines
 */
public class Validacao {
    
    public static String texto(){
        return "";
    }
    
    public static boolean numero(String n){
        try {
            float valor=Float.parseFloat(n);
            if (1/valor>0)
                return true;
            else
                throw new Exception("Valor necessita ser maior que zero");
        } catch (Exception e) { 
            return false;
            
        }
        
    }
    
    public static Date data(){
        
        return data();
    }
    
}
