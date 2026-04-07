import aula6.Cliente;
import org.w3c.dom.ls.LSOutput;

void main() {
    ArrayList<Cliente> cliente = new ArrayList<>();

    boolean desejaSair = false;

    while(!desejaSair){
        int opcaoEscolhida= menu();

        switch (opcaoEscolhida){
            case 1:
                System.out.println("1 = Adiciodo novo cliente");
                // Adicionar novo cliente
                break;
            case 2:
                System.out.println("2 = Listar clientes");
                // Listar clientes
                break;
            case 3:
                System.out.println("3 = Remover cliente");
                break;
            case 4:
                System.out.println("4 = Editar cliente");
                //editar cliente
                break;
            case 5:
                System.out.println("4 = Sair");
                //Sair
                break;

        }

        if (opcaoEscolhida == 5){
            desejaSair = true;
        }
    }
    int opcaoEscolhida = menu();
}
public int menu() {
    System.out.println("Digite uma das opcões abaixo");
    System.out.println("1 = Adicionar novo cliente");
    System.out.println("2 = Listar clientes");
    System.out.println("3 = Remover cliente");
    System.out.println("4 = Editar cliente");
    System.out.println("5 = Sair");

    int opcaoEscolhida = Integer.parseInt(IO.readln());
    return opcaoEscolhida;
}