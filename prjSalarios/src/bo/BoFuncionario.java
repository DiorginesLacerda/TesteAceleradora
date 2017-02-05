/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import java.util.ArrayList;
import java.util.List;
import models.Funcionario;

/**
 *
 * @author diorgines
 */
public class BoFuncionario {
    private Funcionario funcionario;
    private List<Funcionario> listaFuncionario;

    public BoFuncionario() {
        this.listaFuncionario=new ArrayList<>();
    }
    
    public void addFuncionario(Funcionario funcionario){
        this.listaFuncionario.add(funcionario);
    }

    @Override
    public String toString() {
        String retorno="";
        for (Funcionario funcionario : listaFuncionario) {
            retorno +=funcionario.toString();
        }
        return retorno+"\n\r";
    }

    public String listaNome(){
        String retorno="";
        for (Funcionario funcionario : listaFuncionario) {
            retorno +=funcionario.getNome()+"\n\r";
        }
        return retorno+"\n\r";
    }
    
    public String listaCustos(){
        String retorno="";
        float salario=0;
        float inss=0;
        float seguroDeVida=0;
        float valeRefeicao=0;
        float valeTranposte=0;
        
        for (Funcionario funcionario : listaFuncionario) {
            salario+=funcionario.getSalario();
            inss+=funcionario.getInss();
            seguroDeVida+=funcionario.getSeguroDeVIda();
            valeRefeicao+=funcionario.getValeRefeicao();
            valeTranposte+=funcionario.getValeTranposte();
        }
        retorno=("Total dos Custos da Folha de Pagamento"+
                "\n\rSalários: R$"+Float.toString(salario)+
                "\n\rINSS: R$"+Float.toString(inss)+
                "\n\rSeguro de Vida: R$"+Float.toString(seguroDeVida)+
                "\n\rVale Refeição: R$"+Float.toString(valeRefeicao)+
                "\n\rVale Transporte: R$"+Float.toString(valeTranposte)+
                "\n\rTotal de Custos:"+Float.toString(salario+inss+seguroDeVida+valeRefeicao+valeTranposte)+
                "\n\n\r");
        return retorno;
    }
    
    
    public List<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    public void setListaFuncionario(List<Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }


    
    
    
}
