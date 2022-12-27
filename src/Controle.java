import java.util.ArrayList;


public class Controle extends Loja {

    private String Usuario;

    public ArrayList controle = new ArrayList<>();

    public Controle() {
        this.controle = new ArrayList<>();
    }

    public void addLoja(Produtos item) {
        controle.add(item);
    }

    public void addFornecedor(Fornecedor item) {
        controle.add(item);
    }

    public void listarCelular() {
        System.out.println("\nCelulares disponiveis:");


        for (Object item : controle) {
            if (item instanceof Celular) {
                System.out.print("O celular é da Marca: " + ((Produtos) item).getMarca() + " Modelo: " + ((Produtos) item).getModelo() + " Numero de Série: " + ((Produtos) item).getNumSerie() + " Numero de Lote:" +
                        ((Produtos) item).getNumLote() + " Transportadora: " + ((Produtos) item).getTransportadora() + " Mes: " +
                        ((Produtos) item).getMes() + " Ano: " + ((Produtos) item).getAno() + "\n");

            }

        }
    }

    public void listarNotebook() {
        System.out.println("\nNotebooks disponiveis:");

        for (Object item : controle) {
            if (item instanceof Notebook) {
                System.out.print("O notebook e da Marca: " + ((Produtos) item).getMarca() + " Modelo: " + ((Produtos) item).getModelo() + " Numero de Série: " + ((Produtos) item).getNumSerie() + " Numero de Lote:" +
                        ((Produtos) item).getNumLote() + " Transportadora: " + ((Produtos) item).getTransportadora() + " Mes: " +
                        ((Produtos) item).getMes() + " Ano: " + ((Produtos) item).getAno() + "\n");

            }


        }
    }

    public void listarFornecedor() {

        System.out.println("\nLista de Fornecedores: ");
        for (Object item : controle) {
            if (item instanceof Fornecedor) {
                System.out.println(" " + ((Fornecedor) item).getNome() + " Telefone de contato: " + ((Fornecedor) item).getTelefoneContato());
            }


        }


    }

    /*public void procurarItem() {
        for (Object item : controle) {
            if (item == Usuario) {
                if (item instanceof Produtos) {

                    System.out.println("O modelo esta disponivel.");

                } else{
                    System.out.println("Nao esta disponivel.");
                }
            }

        }
    }*/
}




