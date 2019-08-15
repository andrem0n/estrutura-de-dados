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
public class No {
    
    private int chave;
    private Aluno aluno;
    private No esq;
    private No dir;
    
    public No(int chave, Aluno aluno){
        this.chave = chave;
        this.aluno = aluno;
        this.esq = null;
        this.dir = null;
    }

    public int getChave() {
        return chave;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public No getEsq() {
        return esq;
    }

    public No getDir() {
        return dir;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }
    
    
}
