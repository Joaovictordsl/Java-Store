public class Fornecedor {
    private String Nome;
    private int telefoneContato;

    public Fornecedor (String Nome, int telefoneContato){
        this.Nome = Nome;
        this.telefoneContato = telefoneContato;
    }

    public String getNome(){
        return Nome;

    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public int getTelefoneContato(){
        return telefoneContato;
    }


}
