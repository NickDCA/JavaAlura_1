public class Exercicios {

    public static void main(String[] args) {
        double nota1 = 8.9;
        int nota2 = 6;
        int nota1Inteira = (int) nota1;
        System.out.println("Nota 1 Inteira: " + nota1Inteira);
        double mediaNotas = (nota1 + nota2) / 2;
        System.out.println("Media das notas: " + mediaNotas);
        char letra = 'a';
        String palavra = "assombrad";
        System.out.println(palavra + letra);
        double precoProduto = 89.56;
        int quantidade = 5;
        double valorTotal = precoProduto * quantidade;
        System.out.println("Valor Total: " + valorTotal);
        double valorEmDolares = 67.82;
        System.out.println(String.format("Valor em dólares: %.2f" +
                "Valor convertido em reais: %.2f",
                valorEmDolares, (valorEmDolares * 4.94)));
        double precoOriginal = 14.56;
        double percentualDesconto = 20;
        double desconto = precoOriginal * (percentualDesconto / 100);
        System.out.println("Desconto: " + desconto);
    }

}
