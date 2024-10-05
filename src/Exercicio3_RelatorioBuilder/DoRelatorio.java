package Exercicio3_RelatorioBuilder;

public class DoRelatorio {
    private Relatorio relatorio = new Relatorio();

    public DoRelatorio setTitulo(String titulo){
        this.relatorio.setTitulo(titulo);
        return this;
    }
    public DoRelatorio setCorpo(String corpo){
        this.relatorio.setCorpo(corpo);
        return this;
    }
    public DoRelatorio setRodape(String rodape){
        this.relatorio.setRodape(rodape);
        return this;
    }

    public Relatorio build(){
        return this.relatorio;
    }
}
