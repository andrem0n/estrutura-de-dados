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
public interface IArvore {
    
    public boolean add(int chave, Aluno info);
    public boolean remove(int chave);
    public boolean isEmpity();
    public int size();
    public String toString();
    
}
