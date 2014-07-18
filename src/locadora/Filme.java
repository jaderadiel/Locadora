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
public class Filme {
    
    private String titulo;
    private Categoria categoria;
    private GeneroFilme genero;    
    
    public Filme(Categoria categoria){
        this(null, categoria, null);
    }
    
    public Filme(String titulo, Categoria categoria){
        this(titulo, categoria, null);
    }
    
    public Filme(String titulo, Categoria categoria, GeneroFilme genero){
        this.titulo = titulo;
        this.categoria = categoria;
        this.genero = genero;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public GeneroFilme getGenero() {
        return genero;
    }

    public void setGenero(GeneroFilme genero) {
        this.genero = genero;
    }

    
    
}
