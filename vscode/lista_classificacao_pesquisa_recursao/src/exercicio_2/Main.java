package exercicio_2;

public class Main {

    public static void main(String[] args) {

        
        ArranjoInteiros arranjo = new ArranjoInteiros(10);
        arranjo.inserir(1, 0);
        arranjo.inserir(2, 1);
        arranjo.inserir(3, 2);
        arranjo.inserir(4, 3);
        arranjo.inserir(5, 4);
        arranjo.inserir(6, 5);
        arranjo.inserir(7, 6);
        arranjo.inserir(8, 7);
        arranjo.inserir(9, 8);
        arranjo.inserir(10, 9);


        /** 
         * questão c
        */
        System.out.println("Vetor multiplicado: ");
        arranjo.multiplicarVetor(arranjo.getVetor(), 2);
        System.out.println("");
        System.out.println(arranjo.toString());

        /**
         * questão d
         */
        arranjo.ordenar();
        System.out.println(arranjo.buscarValor(7));

        /**
         * questão e
         */
        System.out.println(arranjo.buscaValorRecursiva(arranjo.getVetor(), 0, 9, 6));

        
    }
}