import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner lerTexto = new Scanner(System.in);
        Scanner lerNum = new Scanner(System.in);
        
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 345.22;

        System.out.print("Por favor, informe o número da conta\n");
        numeroConta = lerNum.nextInt();

        System.out.print("Informe a agência\n");
        agencia = lerTexto.nextLine();

        System.out.print("Informe seu nome\n");
        nomeCliente = lerTexto.nextLine();

        System.out.println("Olá ".concat(nomeCliente) + 
        ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia) + ", conta " + numeroConta
        + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
