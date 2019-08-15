
public interface IVetor<E> {
    public boolean add(E item);
    public boolean contains(E item);
    public int get(E indice);
    public int indexOf(E item);
    public boolean isEmpty();
    public boolean isFull();	
    public boolean remove(E item);
    public boolean set(E indice, E novoItem);
    public int size();
    public String toString();
}