
package exemploPessoa;

/**
 *
 * @author timoteodimapereira
 */
public class Professor extends Pessoa{
    private String titulo;
    private String areaAtuacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public Professor(String titulo, String areaAtuacao, String nome, int idade, String endereco, Filiacao filiacao) {
        super(nome, idade, endereco, filiacao);
        this.titulo = titulo;
        this.areaAtuacao = areaAtuacao;
    }
    public String toString(){
      return  "\n Dados do Professor: "+
              "\n Título: "+getTitulo()+
              "\n Area de Atuação: "+getAreaAtuacao();
             
                
    }
    
    
    
}
