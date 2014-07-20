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
        if (item == null){
            return;
        }
        Item itensAux[] = new Item[++qtdItens];
        if (itens != null){
            System.arraycopy(itens, 0, itensAux, 0, itens.length);
        }
        itensAux[qtdItens - 1] = item;
        this.itens = itensAux;
    }
    
    public void removeItem(int pos){
        if (pos < 0) {
           System.out.println("Posição informada é inválida!");
           return;
        }
        if (this.itens == null) {
           System.out.println("Locação sem itens!"); 
           return; 
        }
        if (this.itens.length <= 0){
           System.out.println("Locação sem itens!"); 
           return; 
        }
        
        Item itensAux[] = new Item[qtdItens - 1]; //array auxiliar contendo o total de itens depois da alteração.
        itens[pos] = null;
        if (pos == 0){
            System.arraycopy(itens, 1, itensAux, 0, itens.length - 1);
        }else{
            if (pos == itens.length - 1) { //se for excluiir a última posição..
                System.arraycopy(itens, 0, itensAux, 0, itens.length -1);
            }else{
                System.arraycopy(itens, 0, itensAux, 0, pos); //copia primeira parte..
                System.arraycopy(itens, pos + 1, itensAux, itensAux.length - 1, itens.length - pos - 1); //copia segunda
            }
        }
        this.itens = itensAux;
    }
    
    public void imprime(){
        double valorTotal = 0;
        System.out.println("================ Locação ================");
        System.out.println("Cliente: " + this.cliente);
        if (itens == null){
            System.out.println("Não existem itens alugados.");
        }else{
            for (Item iten : itens) {
                iten.imprime();
                valorTotal += iten.getValor();
            }        
            System.out.printf("Valor Total Locação =====> %.2f \n", valorTotal);
        }
    }
    
    public int getQtdItens() {
        return qtdItens;
    }
    
}
