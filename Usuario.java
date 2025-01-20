package projetinho;

import java.util.List;

public class Receita {
    String modoDePreparo;
    double porcoes;
    List<Ingrediente> ingredientes;

    public Receita(String modoDePreparo, double porcoes, List<Ingrediente> ingredientes) {
        this.modoDePreparo = modoDePreparo;
        this.porcoes = porcoes;
        this.ingredientes = ingredientes;
    }

    public void addIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public void removeIngrediente(Ingrediente ingrediente) {
        this.ingredientes.remove(ingrediente);
    }
}
