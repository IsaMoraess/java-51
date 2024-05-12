import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
/* Custo de combustível de Viagem:
Peça ao usuário para inserir a distância, consumo médio de combustível e
preço do combustível, calcular o custo de combustível uma viagem. */
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a distancia que você vai percorrer: ");
    double distancia = sc.nextDouble();
    System.out.println("Digite o consumo médio de combustivel: ");
    double consumoMédio = sc.nextDouble();
    System.out.println("Digite o preço do combustivel: ");
    double preco = sc.nextDouble();

    double custoCombustivel = (distancia / consumoMédio) * preco;
    System.out.println("O custo de combustivel da viagem foi de: " + custoCombustivel);

    }
}
