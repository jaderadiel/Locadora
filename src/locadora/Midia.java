/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora;

/**
 *
 * @author Jader
 */
public abstract class Midia {
    
    private double valorLocacao;

    public Midia(){
        calculaValorLocacao();
    }
    
    protected abstract void calculaValorLocacao();
    
    
    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }
    
}
