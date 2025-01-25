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
    public String getModoDePreparo(){
        return modoDePreparo;
    }
    public void setModoDePreparo(String modoDePreparo){
        this.modoDePreparo=modoDePreparo;
    }
    public double getPorcoes(double porcoes){
        return porcoes;
    }
    public void setPorcoes(double porcoes){
        this.porcoes=porcoes;
    }
    public List<Ingrediente> getIngredientes(){
        return ingredientes;
    }
    public void setIngredientes(List<Ingrediente>novoIngredientes){
        this.ingredientes=novoIngredientes;
    }
    public void addIngrediente(Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
    }
    public void removeIngredient(Ingrediente ingrediente){
        this.ingredientes.remove(ingrediente);
    }





}
