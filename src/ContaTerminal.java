import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {

        int numero;

        String agencia;

        String nomeCliente;

        Double saldo;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o numero da agencia: ");
        numero = scan.nextInt();

        System.out.print("Digite o numero da conta: ");
        agencia = scan.next();

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = scan.next();

        System.out.print("Digite o saldo: ");
        saldo = scan.nextDouble();

        System.out.println("Olá "+nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +" , conta " +numero +" e seu saldo " + saldo +" já está disponível para saque");


    }


}