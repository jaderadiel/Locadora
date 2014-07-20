/*
----catalogo----
vhs -> 2,5
dvd -> 2,5
bluray -> 3,5

----lancamento----
vhs -> 3,125
dvd -> 3,125
bluray -> 4,375

----super lancamento----
vhs -> 3,75
dvd -> 3,75
bluray -> 5,25

 */

package locadora;

/**
 *
 * @author Jader
 */
public class Locadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Cria as categorias da locadora
        Catalogo catalago               = new Catalogo();
        Lancamento lancamento           = new Lancamento();
        SuperLancamento superLancamento = new SuperLancamento();
        //
        
        //Cria os tipos de midia 
        Vhs vhs       = new Vhs();
        Dvd dvd       = new Dvd();
        Bluray bluray = new Bluray();
        //
        
        //Cria os filmes disponíveis na locadora
        Filme filmeCatalogo        = new Filme("Homem Aranha", catalago, GeneroFilme.ACAO);
        Filme filmeLancamento      = new Filme("Jeca Tatu", lancamento, GeneroFilme.COMEDIA);
        Filme filmeSuperLancamento = new Filme("A Volta dos que não foram", superLancamento, GeneroFilme.FICCAO);
                
        Locacao locacao = new Locacao("Cliente de teste");
        locacao.addItem(new Item("1", filmeCatalogo, vhs));
        locacao.addItem(new Item("2", filmeLancamento, dvd));
        locacao.addItem(new Item("3", filmeSuperLancamento, bluray));
        locacao.imprime();
        
        Locacao locacao1 = new Locacao("Teste exclusão item 1");
        locacao1.addItem(new Item("1", filmeCatalogo, vhs));
        locacao1.addItem(new Item("2", filmeLancamento, dvd));
        locacao1.addItem(new Item("3", filmeSuperLancamento, bluray));
        locacao1.removeItem(0);
        locacao1.imprime();
        
        Locacao locacao2 = new Locacao("Teste exclusão item 3");
        locacao2.addItem(new Item("1", filmeCatalogo, vhs));
        locacao2.addItem(new Item("2", filmeLancamento, dvd));
        locacao2.addItem(new Item("3", filmeSuperLancamento, bluray));
        locacao2.removeItem(locacao2.getQtdItens() - 1);
        locacao2.imprime();
        
        
        Locacao locacao3 = new Locacao("Teste exclusão item 2");
        locacao3.addItem(new Item("1", filmeCatalogo, vhs));
        locacao3.addItem(new Item("2", filmeLancamento, dvd));
        locacao3.addItem(new Item("3", filmeSuperLancamento, bluray));
        locacao3.removeItem(1);
        locacao3.imprime();
    }
    
}
