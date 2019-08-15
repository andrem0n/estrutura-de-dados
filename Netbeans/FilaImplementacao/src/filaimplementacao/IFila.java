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
public interface IFila {
    public boolean add(int info);
    public boolean remove();
    public int size();
    public boolean isEmpty();
    public String toString();
}
