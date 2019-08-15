import java.util.ArrayList;
import java.util.List;

public class Agenda implements IAgenda{
    public static void main(String[] args) throws Exception {
        
        Pessoa andre = new Pessoa("André", "Avenida Ibicui", 998463738); 
        Pessoa joao = new Pessoa("João", "Rua Joaquim Nabuco", 999963812);
        Pessoa maria = new Pessoa("Maria", "Avenida Assis Brasil", 981625390);
        Pessoa anderson = new Pessoa("Anderson", "Avenida Castro Alves", 987451732);
        
        Agenda agenda = new Agenda();
        
        agenda.inserir(andre);
        agenda.inserir(maria);
        agenda.inserir(joao);
        agenda.inserir(anderson);
        System.out.println("Todas as pessoas: " + agenda.pessoas);
        System.out.println("Pessoas por inicial do nome: " + agenda.consultarPorIniciais("M"));
        System.out.println("Consulta por nome: " + agenda.consultarPorNome("João"));
        agenda.excluirPorNome("Maria");
        System.out.println("Todas as pessoas: " + agenda.pessoas);
        agenda.excluirTodos(agenda.pessoas);
    }
    
    /**
     * Inicializa uma Lista de pessoas contidas na Agenda
     */
    List<Pessoa> pessoas = new ArrayList<>();
    
    @Override
    public boolean inserir(Pessoa pessoa) {
        if (pessoas.add(pessoa)) {
            return true;
        }
        return false;
    }

    @Override
    public Pessoa consultarPorNome(String nome) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().contains(nome)) {
                return pessoas.get(i);  
            }
        } 
        return null;
    }

    @Override
    public boolean excluirPorNome(String nome) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().contains(nome)) {
                System.out.println("Pessoa excluida: " + pessoas.get(i));
                pessoas.remove(pessoas.get(i)); 
                return true; 
            }
        } 
        return false;
    }

    @Override
    public boolean excluirTodos(List<Pessoa> pessoas) {
        if (pessoas.removeAll(pessoas)) {
            System.out.println(pessoas);
            return true;
        }
        return false;
    }

    @Override
    public List<Pessoa> consultarPorIniciais(String iniciais) {
        List<Pessoa> pessoasPorIniciais = new ArrayList<>();
                
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().startsWith(iniciais)) {
                pessoasPorIniciais.add(pessoas.get(i));
            }
        }
        return pessoasPorIniciais;
    }
}