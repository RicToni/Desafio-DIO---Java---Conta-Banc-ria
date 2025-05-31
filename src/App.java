import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("OLá cliente, por favor insira seu nome: ");
    String nome = scanner.nextLine();
    
    System.out.println("Ola " + nome + ", agora por favor digite o número da agência: ");
    String agencia = scanner.nextLine();

    System.out.println("Ola " + nome + ", agora por favor digite o número da sua conta: ");
    int numero = Integer.parseInt(scanner.nextLine());

    System.out.println("Ola " + nome + ", agora por favor digite o valor do seu saldo inicial: ");
    float saldo = Float.parseFloat(scanner.nextLine());
    
    Conta conta1 = new Conta(numero, agencia, nome, saldo);

    System.err.println(conta1.toString());
    

}

    

}
