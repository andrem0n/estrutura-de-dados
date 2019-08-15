import java.util.List;

public interface IAgenda {
    /**
     * Recebe uma pessoa e insere ela na agenda
     * @param pessoa Informa a pessoa a ser inserida na agenda
     * @return Retorna true se consegue inserir uma pessoa na agenda,
     * ou false caso não consiga
     */
    public boolean inserir(Pessoa pessoa);
    
    /**
     * Recebe uma pessoa a fim de encontrá-la na agenda,
     * retornando a pessoa caso encontrada 
     * @param pessoa Informa a pessoa a ser encontrada na consulta
     * @return Retorna a pessoa encontrada, ou null caso não encontre nada na agenda
     */
    public Pessoa consultarPorNome(String nome);
    
    /**
     * Recebe uma pessoa com a função de exclui-la da agenda
     * @param pessoa Informa a pessoa que se deseja excluir
     * @return retorna true se excluir pessoa,
     * ou false caso não consiga exluir
     */
    public boolean excluirPorNome(String nome);

    /**
     * Método que exclui todas as pessoas da agenda
     * @param Informa a lista de pessoas contidas na agenda
     * @return retorna true caso consiga excluir as pessoas,
     * ou false caso não consiga
     */
    public boolean excluirTodos(List<Pessoa> pessoas);

    /**
     * Método que busca pessoas no qual o nome comece com
     * as iniciais inseridas
     * @param Informa as iniciais dos nomes a serem buscados
     * @return retorna uma lista com os nomes encontrados
     * através das iniciais do nome
     */
    public List<Pessoa> consultarPorIniciais(String iniciais);
}