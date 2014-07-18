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
public class Locacao {

    private String cliente;
    private Item itens[];
    private int qtdItens = 0;
    
    
    public Locacao(String cliente){
        setCliente(cliente);
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public void addItem(Item item){
        Item itensAux[] = new Item[++qtdItens];
        if (itens != null){
            System.arraycopy(itens, 0, itensAux, 0, itens.length);
        }
        itensAux[qtdItens - 1] = item;
        this.itens = itensAux;
    }
    
    public void removeItem(int pos){
        
    }
    
    public void imprime(){
        double valorTotal = 0;
        
        System.out.println("================ Locação ================");
        System.out.println("Cliente: " + this.cliente);
        if (itens == null){
            System.out.println("Não existem itens alugados.");
            return;
        }
        
        for(int i = 0; i < itens.length; i++){
            itens[i].imprime();
            valorTotal += itens[i].getValor();
        }        
        
        System.out.printf("Valor Total Locação =====> %.2f \n", valorTotal);
    }
    
}
