/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploPessoa;

/**
 *
 * @author timoteodimapereira
 */
public class TestaPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Professor professor = new Professor("Professor Residendte", "Teologia de Familia", "Cícero", 33, "Rua Bolívia 300", 
                new Filiacao ("Pai de Cícero", "Mãe de Cícero"));
        System.out.println(professor);
        
        Aluno aluno = new Aluno("Timóteo", 38, "SHT", 
                new Filiacao ("Suleimane", "Lisa"), "Informática");
        System.out.println(aluno);
        
        Empregado empregado = new Empregado ("013", "Limpeza", "Dona Maria", 35, "Jardim América", 
                new Filiacao ("Pai de Maria", "Mãe da Maria"));
        System.out.println(empregado);
        
        
    }
    
}
