/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author diorgines
 */
public class Menu {
    private final Scanner scan = new Scanner(System.in);
    
    public String menuPrincipal(){
        System.out.println("Menu Principal \n\r"
                + "1 - Para adicionar um funcionário\n\r"
                + "2 - Para listar Funcionários"
                + "3 - Para listar  Custos"
                + "4 - Encerrar a aplicação");
        return scan.nextLine();
    }
    
}
