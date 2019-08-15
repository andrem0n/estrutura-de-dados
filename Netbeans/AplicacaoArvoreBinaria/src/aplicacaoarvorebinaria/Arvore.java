/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaoarvorebinaria;

/**
 *
 * @author andreBolzan
 */
public class Arvore implements IArvore{

    private int raiz;
    
    public Arvore(){
        
    }
    
    @Override
    public boolean add(int chave, Aluno info) {
        
        No novo = new No(chave, info);
        
        return true;
    }

    @Override
    public boolean remove(int chave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
