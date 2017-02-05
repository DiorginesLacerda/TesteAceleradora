/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.SimpleDateFormat;
import java.time.Instant;
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
                if(valor<=0)
                    return false;
                return true;
        } catch (Exception e) { 
            return false;
            
        }
        
    }
    
    public static boolean data(String entrada){
        SimpleDateFormat simple= new SimpleDateFormat("dd/MM/yyyy");
        if (entrada.matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)")) {
           try {
            Date data = simple.parse(entrada);
            if(data.after(new Date()))
                return false;
            return true;
            } catch (Exception e) {
                return false;
            }
           
        }
        return false;
        
    }
    
}
