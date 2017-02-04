package models;

import java.util.Date;

/**
 *++
 * @author diorgines
 */
public class Funcionario {
    private String nome;
    private float salario;
    private Date admissao;
    private float inss;
    private float seguroDeVida;
    private float valeRefeicao;
    private float valeTranposte;
   // private float totalCustos;
    private Imposto imposto;
            
    public Funcionario() {
    }

    public Funcionario(String nome, float salario, Date admissao) {
        this.nome = nome;
        this.salario = salario;
        this.admissao = admissao;
    }

    public void calculaImposto(){
        inss=salario*imposto.INSS;
        seguroDeVida=salario*imposto.SEGURODEVIDA;
        valeRefeicao=salario*imposto.VALEREFEICAO;
        valeTranposte=salario*imposto.VALETRANSPORTE;
    }

    @Override
    public String toString() {
        return ("Nome:" + nome+
                "; Salário: R$"+Float.toString(salario)+
                "; INSS: R$"+Float.toString(inss)+
                "; SegVida: R$ "+Float.toString(seguroDeVida)+
                "; VR: R$"+Float.toString(valeRefeicao)+
                "; VT: R$"+Float.toString(valeTranposte)+
                "; CustTotal: R$"+Float.toString(salario+seguroDeVida+valeRefeicao+valeTranposte)+"\n\r");
    }
    
    
    
    public float getInss() {
        return inss;
    }

    public void setInss(float inss) {
        this.inss = inss;
    }

    public float getSeguroDeVIda() {
        return seguroDeVida;
    }

    public void setSeguroDeVIda(float seguroDeVIda) {
        this.seguroDeVida = seguroDeVIda;
    }

    public float getValeRefeicao() {
        return valeRefeicao;
    }

    public void setValeRefeicao(float valeRefeicao) {
        this.valeRefeicao = valeRefeicao;
    }

    public float getValeTranposte() {
        return valeTranposte;
    }

    public void setValeTranposte(float valeTranposte) {
        this.valeTranposte = valeTranposte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }
    
    
}
