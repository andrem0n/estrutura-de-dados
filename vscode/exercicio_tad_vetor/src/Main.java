
public class Main {

    public static void main(String[] args){
        Vetor v1 = new Vetor(7);
        System.out.println("v1 = " + v1.toString());
        if(v1.isEmpty())
            System.out.println("Vetor v1 vazio");
        if(v1.isFull())
            System.out.println("Vetor v1 esta cheio");
        v1.add(11);
        v1.add(22);
        v1.add(33);
        System.out.println("get com indice 1: " + v1.get(1));
        System.out.println("v1 = " + v1.toString());
        System.out.println("indice 22 = "+v1.indexOf(22));
        System.out.println("indice 44 = "+v1.indexOf(44));
        v1.set(v1.indexOf(22), 44);
        
        System.out.println("v1 = " + v1.toString());
        System.out.println("indice 44 = "+v1.indexOf(44));
        v1.set(v1.indexOf(44), 22);
        v1.add(44);
        v1.add(55);
        v1.add(66);
        System.out.println("v1 = " + v1.toString());
        v1.remove(66);
        System.out.println("v1 = " + v1.toString());
        //v1.add(11);
        System.out.println("v1 = " + v1.toString());
        System.out.println("v1 contem 11 = " + v1.contains(11));
        System.out.println("v1 contem 66 = " + v1.contains(66));
        System.out.println("tamanho atual do array: " + v1.size());
        //v1.bubbleSort();
        System.out.println("v1 = " + v1.toString());
        System.out.println("Busca binaria do 55 = " + v1.buscaBinaria(22));
        System.out.println("v1 = " + v1.toString());
    }
}