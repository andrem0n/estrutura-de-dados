/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaimplementacao;

/**
 *
 * @author andreBolzan
 */
public class No {
    
    private int info;
    private No prox;
    
    public No(int info){
        this.info = info;
        this.prox = null;
    }

    public int getInfo() {
        return info;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }        
}
