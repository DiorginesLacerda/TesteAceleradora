/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diorgines
 */
public class FuncionarioNegocio {
    private Funcionario funcionario;
    private List<Funcionario> listaFuncionario;

    public FuncionarioNegocio() {
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
        return retorno;
    }

    public String listaNome(){
        String retorno="";
        for (Funcionario funcionario : listaFuncionario) {
            retorno +=funcionario.getNome()+"\n\r";
        }
        return retorno;
    }
    
    
    public List<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    public void setListaFuncionario(List<Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }


    
    
    
}
