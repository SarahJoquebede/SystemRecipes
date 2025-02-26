package projetinho;




public class Receita {
    String titulo;
    String ingrediente;
    String tempoPreparo;

    public Receita(String titulo, String ingrediente, String tempoPreparo) {
        this.titulo = titulo;
        this.ingrediente = ingrediente;
        this.tempoPreparo = tempoPreparo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(String tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    @Override
    public String toString() {
        return "Receita{" + "titulo=" + titulo + ", ingrediente=" + ingrediente + ", tempoPreparo=" + tempoPreparo + '}';
    }
    


}
