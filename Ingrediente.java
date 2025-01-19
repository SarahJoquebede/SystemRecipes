public class Ingrediente {
    String nome;
    double quantidade;
    String unidadeDeMedida;
    public Ingrediente(String nome, double quantidade, String unidadeDeMedida){
        this.nome=nome;
        this.quantidade=quantidade;
        this.unidadeDeMedida=unidadeDeMedida;
    }
    
    public String toString(){
        return nome + "("+ quantidade +"  "+ unidade +")";

    }
}
