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
public abstract class Categoria {
    
    private double valorAcrescimo;
    private int prazoDevolucao;

    public Categoria(){
        calculaValorAcrescimo();
        calculaPrazoDevolucao();
    }
    
    protected abstract void calculaValorAcrescimo();
    
    protected abstract void calculaPrazoDevolucao();
    
    public double getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(double valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }
    
    public int getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public void setPrazoDevolucao(int prazoDevolucao) {
        this.prazoDevolucao = prazoDevolucao;
    }    
    
}
