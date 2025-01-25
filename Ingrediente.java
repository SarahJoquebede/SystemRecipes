package projetinho;

public class Ingrediente {
    double quantidade;
    String nome;
    String unidadeDeMedida;
    public Ingrediente(String nome, double quantidade, String unidadeDeMedida){
        this.nome=nome;
        this.quantidade=quantidade;
        this.unidadeDeMedida=unidadeDeMedida;
    }
    public double getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(double quantidade){
        this.quantidade=quantidade;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setUnidadeDeMedida(String unidadeDeMedida){
        this.unidadeDeMedida=unidadeDeMedida;
    }
    public String getUnidadeDeMedida(){
        return unidadeDeMedida;
    }


    @Override
    public String toString(){
        return "Nome:" + nome + " Quantidade: "+ + quantidade+ " " + unidadeDeMedida;
    }

}
