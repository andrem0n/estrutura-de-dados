
public class Lista implements ILista {

    private No inicio;
    private No fim;
    private int nElementos;

    public Lista() {
        this.inicio = null;
        this.fim = null;
        this.nElementos = 0;
    }

    @Override
    public boolean add(int info) {
        No novo = new No(info);
        if (inicio == null) {
            inicio = novo;
        }
        else {
            fim.setProx(novo);
        }
        fim = novo;
        this.nElementos++;
        return true;
    }

    @Override
    public void clear() {
        inicio = null;
        fim = null;
        nElementos = 0;
    }

    @Override
    public boolean contains(int info) {
        No aux = inicio;

        while (aux != null) {
            if (aux.getInfo() == info) {
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }

    @Override
    public int get(int indice) {
        int count = 0;
        No aux = inicio;

        while (aux != null) {
            if (indice == count) {
                return aux.getInfo();
            }
            aux = aux.getProx();
            count++;
        }      
        return -1;
    }

    @Override
    public int indexOf(int info) {
        int count = 0;
        No aux = inicio;

        while (aux != null) {
            if (aux.getInfo() == info) {
                return count;
            }
            aux = aux.getProx();
            count++;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(int info) {
        return false;
    }

    @Override
    public int set(int índice, int info) {
        No aux = inicio;

        while (aux != null) {
            
        }
        return 0;
    }

    @Override
    public int size() {
        return this.nElementos;
    }
}