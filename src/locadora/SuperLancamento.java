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
public class SuperLancamento extends Categoria {

    @Override
    protected void calculaValorAcrescimo() {
        super.setValorAcrescimo(1.5);
    }

    @Override
    protected void calculaPrazoDevolucao() {
        super.setPrazoDevolucao(1);
    }
    
}
