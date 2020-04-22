
package exemploPessoa;

/**
 *
 * @author timoteodimapereira
 */
public class Empregado  extends Pessoa{
    private String matr;
    private String setor;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Empregado(String matr, String setor, String nome, int idade, String endereco, Filiacao filiacao) {
        super(nome, idade, endereco, filiacao);
        this.matr = matr;
        this.setor = setor;
    }
    
    public String toString(){
        return "\n Dados do Empregaodo:"+
                "\n Matrícula: "+getMatr()+
                "\n Endereço: "+ getEndereco()+
                "\n Setor: "+getSetor();
    }
            
}
