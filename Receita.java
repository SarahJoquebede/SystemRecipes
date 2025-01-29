package projetinho.com;

import java.util.List;

import projetinho.Ingrediente;

public class Receita {
    String modoDePreparo;
    double porcoes;
    List<Ingrediente>ingredientes;
    String origem;
    String tempoDePreparo;
    public Receita(String modoDePreparo, double porcoes, List<Ingrediente>ingredientes, String origem, String tempoDePreparo){
        this.modoDePreparo=modoDePreparo;
        this.porcoes=porcoes;
        this.ingredientes=ingredientes;
        this.origem=origem;
        this.tempoDePreparo=tempoDePreparo;
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
    public void setOrigem(String origem){
        this.origem=origem;
    }
    public String getOrigem(){
        return origem;
    }
    public void setTempoDePreparo(String tempoDePreparo){
        this.tempoDePreparo=tempoDePreparo;
    }
    public String getTempoDePreparo(){
        return tempoDePreparo;
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
