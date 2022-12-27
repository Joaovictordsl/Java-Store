/*
* Jamil de Souza e Joao Victor de Sousa Lima
* */import java.util.ArrayList;
import java.util.Scanner;
public class Teste extends Controle {

    public static void main(String[] args) {
        
        Controle controle = new Controle();
        

        //(String Marca, String Modelo, String NumSerie, int Ano, int Mes, int Numlote, String Transportadora)
        Celular celularA = new Celular("Samsung","12763512","987456MS",2018,05,123456,"Correios");
        Celular celularB = new Celular("Apple","12763512","987456MS",2018,05,123456,"Correios");

        Notebook notebookA = new Notebook("Asus","12763512","987456MS",2018,05,123456,"Correios");

        controle.addLoja(celularA);
        controle.addLoja(celularB);
        controle.addLoja(notebookA);

        System.out.print("Digite o modelo do produto que deseja buscar \n\n");
        Scanner input = new Scanner(System.in);

        //String Usuario;
        //input.next(Usuario);
        controle.listarCelular();
        controle.listarNotebook();

        Fornecedor fornecedorA = new Fornecedor("Lojas Paulo",319837);
        controle.addFornecedor(fornecedorA);
        controle.listarFornecedor();
        
        
        


    }
}
