
public class Carro {

    private String placa;
    private String marca;
    private String modelo;
    private String cor;

    public Carro(String placa, String marca, String modelo, String cor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getCor() {
        return this.cor;
    }   

    @Override
    public String toString() {
        return " " +
            " placa='" + getPlaca() + "'" +
            ", marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", cor='" + getCor() + "'" +
            ".";
    }
}