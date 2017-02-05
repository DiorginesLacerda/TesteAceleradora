/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import models.FuncionarioNegocio;

/**
 *
 * @author diorgines
 */
public class Main {
     private Menu menu = new Menu();
     private FuncionarioNegocio fNegocio = new FuncionarioNegocio();
     
    public static void main(String[] args) {
        try {
                
            } catch (Exception e) {
            }
    }
    
    public void leMenu() throws Exception{
        switch(menu.menuPrincipal()){
            case "1":
                fNegocio.addFuncionario(menu.menuFuncionario());
            case "2":
                if(!fNegocio.getListaFuncionario().isEmpty())
                    System.out.println(fNegocio.toString());
                else
                    System.out.println("Não existem funcionários cadastrados");
            case "3":
            case "4":
            default:
                    
        }
    
}
}
