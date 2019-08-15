
public interface IGaragem {
    
    /**
     * Método para inserir um carro na garagem
     * @param Informa um carro a ser inserido na garagem
     * @return retorna true caso consiga inserir o carro,
     * ou false caso não consiga
     */
    public boolean inserir(Carro carro);
    
    /**
     * Método que consulta um carro dentro da garagem
     * @param Informa o carro que deverá ser procurado na garagem
     * @return Retorna o carro da garagem se encontrado,
     * caso contrário retorna null
     */
    public Carro consultar(String placa);
    
    /**
     * Método para excluir um carro da garagem
     * @param Informa um carro a ser excluido da garagem
     */
    public boolean excluir(String placa);
}