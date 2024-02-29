import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {
        String nome = "Eduardo";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        // System.out.println(String.format(
        // "***************************\n" +
        // "Dados iniciais do cliente:\n\n" +
        // "Nome: %s\n" +
        // "Tipo conta: %s\n" +
        // "Saldo inicial: %.2f\n" +
        // "***************************",
        // nome, tipoConta, saldo));

        String dadosIniciais = """
                **********************************
                Dados iniciais do cliente:

                Nome: %s
                Tipo da conta: %s
                Saldo inicial: %.2f
                **********************************



                """.formatted(nome, tipoConta, saldo);

        System.out.println(dadosIniciais);

        String operacoes = """
                Operações

                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair

                Digite a opção desejada:""";

        Scanner in = new Scanner(System.in);
        int operacao = -1;
        double valorRecebido;
        double valorTransferido;

        while (operacao != 4) {
            System.out.println(operacoes);
            operacao = in.nextInt();

            if (operacao == 1) {
                System.out.println(String.format("O saldo atual é R$%.2f\n", saldo));
            } else if (operacao == 2) {
                System.out.println("Informe o valor a receber: ");
                valorRecebido = in.nextDouble();
                if (valorRecebido >= 0) {
                    saldo += valorRecebido;
                    System.out.println(String.format("Saldo atualizado: R$%.2f\n", saldo));
                } else {
                    System.out.println("Operação inválida");
                }
            } else if (operacao == 3) {
                System.out.println("Informe o valor da transferência: ");
                valorTransferido = in.nextDouble();
                if (saldo >= valorTransferido && valorTransferido >= 0) {
                    saldo -= valorTransferido;
                    System.out.println(String.format("Saldo atualizado: R$%.2f\n", saldo));
                } else {
                    System.out.println("Operação inválida");
                }

            }
        }

        in.close();
    }
}
