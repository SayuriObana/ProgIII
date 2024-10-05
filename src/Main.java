import Exercicio1_PizzaBuilder.DoPizza;
import Exercicio1_PizzaBuilder.Pizza;
import Exercicio2_VeiculoBuilder.DoVeiculo;
import Exercicio2_VeiculoBuilder.Veiculo;
import Exercicio3_RelatorioBuilder.DoRelatorio;
import Exercicio3_RelatorioBuilder.Relatorio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Exercicio1();
        Exercicio2();
        Exercicio3();
    }

    public static void Exercicio1(){

        Pizza Bacon = new DoPizza()
                .setMassa("4 Queijos")
                .setTamanho("Pequena")
                .setIngredientes("Molho Pomodoro, Muçarela, Bacon e orégano")
                .build();

        Pizza Parmegiana = new DoPizza()
                .setMassa("4 Queijos")
                .setTamanho("Média")
                .setIngredientes("Molho Pomodoro, Muçarela, Filé em cubos ao molho de tomate, Presunto e Orégano")
                .build();

        Pizza Brocolis = new DoPizza()
                .setMassa("4 Queijos")
                .setTamanho("Grande")
                .setIngredientes("Molho Pomodoro, Muçarela, Brócolis, Requeijão e Orégano")
                .build();

        System.out.println(Bacon.toString());
        System.out.println(Parmegiana.toString());
        System.out.println(Brocolis.toString());
    }

    public static void Exercicio2() {

        Veiculo HRV = new DoVeiculo()
                .setTipo("SUV")
                .setCor("Prata")
                .setRodas("4")
                .build();

        Veiculo Pajero = new DoVeiculo()
                .setTipo("SUV")
                .setCor("Preto")
                .setRodas("4")
                .build();

        Veiculo BIZ = new DoVeiculo()
                .setTipo("Motocicleta")
                .setCor("Branco")
                .setRodas("2")
                .build();

        System.out.println(HRV.toString());
        System.out.println(Pajero.toString());
        System.out.println(BIZ.toString());

    }
        public static void Exercicio3(){

        Relatorio Leitura = new DoRelatorio()
                .setTitulo("SUV")
                .setCorpo("Prata")
                .setRodape("4")
                .build();

        Relatorio Anual = new DoRelatorio()
                .setTitulo("SUV")
                .setCorpo("Preto")
                .setRodape("4")
                .build();

        System.out.println(Leitura.toString());
        System.out.println(Anual.toString());

    }
}