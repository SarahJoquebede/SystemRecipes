package projetinho.com;

import java.util.List;

import projetinho.Ingrediente;

public class Receita {
    String modoDePreparo;
    double porcoes;
    List<Ingrediente>ingredientes;
    public Receita(String modoDePreparo, double porcoes, List<Ingrediente>ingredientes){
        this.modoDePreparo=modoDePreparo;
        this.porcoes=porcoes;
        this.ingredientes=ingredientes;
    }
    public void addIngrediente(Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
    }
    public void removeIngredient(Ingrediente ingrediente){
        this.ingredientes.remove(ingrediente);
    }   




}
