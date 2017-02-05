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
     private static Menu menu = new Menu();
     private static FuncionarioNegocio fNegocio = new FuncionarioNegocio();
     
    public static void main(String[] args) {
        while(true){
            try {
                leMenu();
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.out.println("\n\n\n");
            }
        }
        
    }
    
    public static void leMenu() throws Exception{
        switch(menu.menuPrincipal()){
            case "1":
                fNegocio.addFuncionario(menu.menuFuncionario());
                break;
            case "2":
                 if(!fNegocio.getListaFuncionario().isEmpty())
                    System.out.println(fNegocio.listaNome());
                else
                    System.out.println("Não existem funcionários cadastrados");
                break;
            case "3":
                if(!fNegocio.getListaFuncionario().isEmpty())
                    System.out.println(fNegocio.toString()+fNegocio.listaCustos());
                else
                    System.out.println("Não existem funcionários cadastrados");
                break;
            case "0":
                System.exit(0);
            default:
                throw new Exception("Valor digitado inválido. Favor digite o número de uma das opçoes listadas");
                    
        }
    
}
}
