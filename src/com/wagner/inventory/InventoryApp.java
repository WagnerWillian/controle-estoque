package com.wagner.inventory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InventoryApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Product product = null;

        while (product == null) {

            try {
                System.out.println("Digite o nome do produto.");
                String name = scanner.nextLine();
                System.out.println("Valor do produto.");
                double price = scanner.nextDouble();
                System.out.println("Quantidade de entrada.");

                int quantity = scanner.nextInt();
                scanner.nextLine();
                product = new Product(name, price, quantity);
                System.out.println("Produto Cadastrado");

            } catch (InputMismatchException exception) {
                System.out.println("Entrada invalida, digite somente numeros.");
                scanner.nextLine();
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }

        }
        int option = -1;

        while (option != 0) {
            System.out.println("=====Controle de estoque:=====");
            System.out.println("|   1 - Consultar Produto    |");
            System.out.println("|   2 - Adicionar Estoque    |");
            System.out.println("|   3 - Realizar venda       |");
            System.out.println("|   4 - Alterar preço        |");
            System.out.println("|   0 - Encerrar Programa    |");
            System.out.println("==============================");

            try {

                option = scanner.nextInt();
                switch (option) {
                    case 1 -> {
                        System.out.printf("Produtos Disponiveis.\n produto: %s preço R$: %.2f Disponivel em estoque: %d\n", product.getName(), product.getPrice(), product.getQuantity());
                    }
                    case 2 -> {
                        System.out.println("Digite a quantidade que deseja adicionar ao estoque");
                        int quantity = scanner.nextInt();

                        if (product.addStock(quantity)) {
                            System.out.println("Estoque atualizado com sucesso! \n Quantidade: " + product.getQuantity());
                        } else {
                            System.out.println("Não foi possivel atualizar o estoque");
                        }
                    }
                    case 3 -> {
                        System.out.println("Quantidade da venda");
                        int quantity = scanner.nextInt();
                        if (product.removeStock(quantity)) {
                            System.out.println("Venda realizada! \n Quantidade: " + product.getQuantity());
                        } else {
                            System.out.println("não foi possivel realizar a venda");
                        }
                    }
                    case 4 -> {
                        System.out.println("Digite o novo preço do produto:");
                        double newPrice = scanner.nextDouble();
                        if (product.updatePrice(newPrice)) {
                            System.out.println("Preço atualizado");
                        } else {
                            System.out.println("Não foi possivel atualizar o preço");
                        }

                    }
                    case 0 -> System.out.println("Programa encerrado ");
                    default -> System.out.println("Opção invalida");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Digite somente numeros.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

}