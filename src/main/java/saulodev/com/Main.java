package saulodev.com;

import saulodev.com.builder.ProdutoBuilder;

public class Main {
    public static void main(String[] args) {

        ProdutoBuilder produtoLucroReal = new ProdutoBuilder.Builder(1, "Arroz")
                .ipi(5.500)
                .frete(50.25)
                .pis(25.50)
                .confins(9.75)
                .build();

        ProdutoBuilder produtoLucroSimples = new ProdutoBuilder.Builder(2, "Feijão")
                .ipi(7.500)
                .frete(25.75)
                .build();
    }
}