public class Produtos extends Loja{

    private String Marca;
    private String Modelo;
    private String NumSerie;
    private int Ano;
    private int Mes;
    private int NumLote;
    private String Transportadora;

    public Produtos(String Marca, String Modelo, String NumSerie, int Ano, int Mes, int Numlote, String Transportadora){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.NumLote = Numlote;
        this.NumSerie = NumSerie;
        this.Ano = Ano;
        this.Mes = Mes;
        this.Transportadora = Transportadora;
    }

    public String getMarca(){
        return Marca;

    }

    public void setMarca(String Marca){
        this.Marca = Marca;
    }

    public String getModelo(){
        return Modelo;

    }

    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }

    public String getNumSerie(){
        return NumSerie;

    }

    public void setNumSerie(String numSerie){
        this.NumSerie = NumSerie;
    }

    public int getNumLote(){
        return NumLote;

    }

    public void setNumLote(int NumLote){
        this.NumLote = NumLote;

    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public int getMes() {
        return Mes;
    }

    public void setMes(int mes) {
        Mes = mes;
    }

    public String getTransportadora(){
        return Transportadora;

    }

    public void setTransportadora(String Transportadora){
        this.Transportadora = Transportadora;
    }
}
