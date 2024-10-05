package Exercicio2_VeiculoBuilder;

public class DoVeiculo {
    private Veiculo veiculo = new Veiculo();

    public DoVeiculo setTipo(String tipo){
        this.veiculo.setTipo(tipo);
        return this;
    }
    public DoVeiculo setCor(String cor){
        this.veiculo.setCor(cor);
        return this;
    }
    public DoVeiculo setRodas(String rodas){
        this.veiculo.setRodas(rodas);
        return this;
    }

    public Veiculo build(){
            return this.veiculo;
        }
}
