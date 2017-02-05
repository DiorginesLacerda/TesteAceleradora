/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author diorgines
 */
public class Validacao {
    
    public static boolean nome(String entrada){
        if(entrada.trim().length()<3)
            return false;
        else
            return true;
    }
    
    public static boolean numero(String entrada){
        try {
            float valor=Float.parseFloat(entrada);
                return (1/valor>0);
        } catch (Exception e) { 
            return false;
            
        }
        
    }
    
    public static boolean data(String entrada){
        SimpleDateFormat simple= new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data = simple.parse(entrada);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
}
