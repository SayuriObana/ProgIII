package Exercicio1_PizzaBuilder;

public class DoPizza {
    private Pizza pizza = new Pizza();

    public DoPizza setMassa(String massa){
        this.pizza.setMassa(massa);
        return this;
    }
    public DoPizza setTamanho(String tamanho){
        this.pizza.setTamanho(tamanho);
        return this;
    }

    public DoPizza setIngredientes(String ingredientes){
        this.pizza.setIngredientes(ingredientes);
        return this;
    }

    public Pizza build(){
        return this.pizza;
    }
}

