/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import models.Funcionario;
import util.Validacao;

/**
 *
 * @author diorgines
 */
public class Menu {
    private final Scanner scan = new Scanner(System.in);
    private Funcionario funcionario;
    
    public String menuPrincipal(){
        System.out.println("Menu Principal \n\r"
                + "1 - Para adicionar um funcionário\n\r"
                + "2 - Para listar Funcionários\n\r"
                + "3 - Relatório detalhado de Custos\n\r"
                + "0 - Encerrar a aplicação\n\r");
        return scan.nextLine();
    }
    public Funcionario menuFuncionario() throws Exception{
        String nome,entrada;
        int tentativa=0;
        final int maxT=3;
        Date data;
        SimpleDateFormat simple= new SimpleDateFormat("dd/MM/yyyy");
        float salario;
        while(true){
            System.out.println("Digite o nome do funcionario");
            entrada=scan.nextLine();
            if(Validacao.nome(entrada)){
                nome=entrada;
                tentativa =0;
                break;
            }
            else
                if(tentativa<maxT){
                    System.err.println("Nome Inválido. Favor digite um nome com no mínimo 3 caracteres");
                    tentativa ++;
                }
                    
                else
                    throw new Exception("Número máximo de erros atingido, operação cancelada. \n\n\r");
        }
        
        while(true){
            System.out.println("Digite o salário do funcionario");
            entrada=scan.nextLine();
            if(Validacao.numero(entrada)){
                tentativa=0;
                salario=Float.parseFloat(entrada);
                break;
            }
            else
                if(tentativa<maxT){
                    System.err.println("Valor inválido. Favor digite um número maior que 0");
                    tentativa ++;
                }     
                else
                    throw new Exception("Número máximo de erros atingido, operação cancelada. \n\n\r");
        }
        while(true){
            System.out.println("Digite a data de Admissão do funcionario no formato dd/mm/aaaa");
            entrada=scan.nextLine();
            if(Validacao.data(entrada)){
                tentativa=0;
                data=simple.parse(entrada);
                break;
            }
            else
                if(tentativa<maxT){
                    System.err.println("Data inválida. Favor digite uma data no formato dd/mm//aaaa");
                    tentativa ++;
                }     
                else
                    throw new Exception("Número máximo de erros atingido, operação cancelada. \n\n\r");
        }
        return funcionario=new Funcionario(nome, salario, data);
        
    }
}
