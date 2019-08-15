import java.util.ArrayList;
import java.util.List;

public class Garagem implements IGaragem {

    private static void main(String[] args) {
        
    }
    /**
     * Inicialização de lista de carros que fazem parte da garagem
     */
    List<Carro> carros = new ArrayList<>();

    @Override
    public boolean inserir(Carro carro) {
        if (carros.add(carro)) {
            return true;
        }
        return false;
   }

    @Override
    public Carro consultar(String placa) {
        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getPlaca().contains(placa)) {
                return carros.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean excluir(String placa) {
        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getPlaca().contains(placa)) {
                carros.remove(carros.get(i));
                return true;
            }
        }
        return false;
    }
}