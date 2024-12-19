import java.util.List;
public class Receita {
    String nome;
    String modoDePreparo;
    int porcoes;
    String List<Ingrediente>ingredientes;
    public Receita( String nome, int porcoes, String modoDePreparo, String List<Ingrediente> ingredientes){
        this.nome=nome;
        this.porcoes=porcoes;
        this.modoDePreparo=modoDePreparo;
        this.ingrediente=ingrediente;
    }
    public void adicionarIngrediente(List<Ingrediente> ingredientes){
        ingrediente++;
    }
    public void removerIngrediente(List<Ingrediente> ingredientes){
        ingrediente--;
    }
    public alterarQtdPorcoes(int novasPorcoes){
        porcoes++;
    }
    public void exibirModoDePreparo(){
        System.out.println("Modo de Preparo:"+modoDePreparo);

    }
    public String setNome(){
        this.nome=nome;
    }
    public String getNome(){
        return nome;

    }
    public String setModoDePreparo(){
        this.modoDePreparo=modoDePreparo;
    }
    public String getModoDePreparo(){
        return modoDePreparo;

    }

}
