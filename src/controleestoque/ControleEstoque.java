package controleestoque;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleEstoque {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Produto produto = null;

        while (produto == null) {

            try {
                System.out.println("Digite o nome do produto.");
                String nome = scanner.nextLine();
                System.out.println("Valor do produto.");
                double preco = scanner.nextDouble();
                System.out.println("Quantidade de entrada.");

                int quantidade = scanner.nextInt();
                scanner.nextLine();
                produto = new Produto(nome, preco, quantidade);
                System.out.println("Produto Cadastrado");

            } catch (InputMismatchException erro) {
                System.out.println("Entrada invalida, digite somente numeros.");
                scanner.nextLine();
            } catch (IllegalArgumentException erro) {
                System.out.println(erro.getMessage());
            }

        }
        int opc = -1;

        while (opc != 0) {
            System.out.println("=====Controle de estoque:=====");
            System.out.println("|   1 - Consultar Produto    |");
            System.out.println("|   2 - Adicionar Estoque    |");
            System.out.println("|   3 - Realizar venda       |");
            System.out.println("|   4 - Alterar preço        |");
            System.out.println("|   0 - Encerrar Porgrama    |");
            System.out.println("==============================");

            try {

                opc = scanner.nextInt();
                switch (opc) {
                    case 1 -> {
                        System.out.printf("Produtos Disponiveis.\n produto: %s preço R$: %.2f Disponivel em estoque: %d\n", produto.getNome(), produto.getPreco(), produto.getQuantidade());
                    }
                    case 2 -> {
                        System.out.println("Digite a quantidade que deseja adicionar ao estoque");
                        int quantidade = scanner.nextInt();

                        if (produto.adicionarEstoque(quantidade)) {
                            System.out.println("Estoque atualizado com sucesso! \n Quantidade: " + produto.getQuantidade());
                        } else {
                            System.out.println("Não foi possivel atualizar o estoque");
                        }
                    }
                    case 3 -> {
                        System.out.println("Quantidade da venda");
                        int quantidade = scanner.nextInt();
                        if (produto.removerEstoque(quantidade)) {
                            System.out.println("Venda realizada! \n Quantidade: " + produto.getQuantidade());
                        } else {
                            System.out.println("não foi possivel realizar a venda");
                        }
                    }
                    case 4 -> {
                        System.out.println("Digite o novo preço do produto:");
                        double novoPreco = scanner.nextDouble();
                        if (produto.alterarPreco(novoPreco)) {
                            System.out.println("Preço atualizado");
                        } else {
                            System.out.println("Não foi possivel atualizar o preço");
                        }

                    }
                    case 0 -> System.out.println("Programa encerrado ");
                    default -> System.out.println("Opção invalida");
                }
            } catch (InputMismatchException erro) {
                System.out.println("Digite somente numeros.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

}