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
public class Item {
    
    private String numeroSerie;
    private Filme filme;
    private Midia midia;
    
    public Item(Filme filme, Midia midia){
        this(null, filme, midia);
    }
    
    public Item(String numeroSerie, Filme filme, Midia midia){
        this.numeroSerie = numeroSerie;
        this.filme = filme;
        this.midia = midia;
    }

    public double getValor() {
        return filme.getCategoria().getValorAcrescimo() * midia.getValorLocacao();
    }
    
    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Midia getMidia() {
        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }
    
    public void imprime(){
        System.out.printf("Titulo: " + filme.getTitulo() + " - Genero: " + 
                filme.getGenero().toString() + " - Valor: %.2f - Entregar em " + filme.getCategoria().getPrazoDevolucao() +
                " dia(s).\n", this.getValor());
        
    }
}
