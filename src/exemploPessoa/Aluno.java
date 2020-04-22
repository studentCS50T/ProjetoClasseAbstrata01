
package exemploPessoa;

/**
 *
 * @author timoteodimapereira
 */
public class Aluno extends Pessoa {
private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno(String nome, int idade, String endereco, Filiacao filiacao, String curso) {
        super(nome, idade, endereco, filiacao);
        this.curso = curso;
    }

public String toString(){
    return "\n Dados do Aluno:"+
            "\n Nome: "+getNome()+
            "\n Idade: "+getIdade()+
            "\n Endereço: "+getEndereco()+
            "\n Curso: "+getCurso()+
            "\n Filiação: "+getFiliacao();
            
}    
}
