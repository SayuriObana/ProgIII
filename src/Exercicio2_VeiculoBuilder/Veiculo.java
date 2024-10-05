package Exercicio2_VeiculoBuilder;

public class Veiculo {

    private String tipo = "";
    private String cor = "";
    private String rodas = "";

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRodas(String rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Tipo: " + this.tipo + " " +
                " Cor: " + this.cor + " " +
                " Rodas: " + this.rodas + " ";
    }
}
