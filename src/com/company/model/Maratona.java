package com.company.model;

import java.util.HashMap;
import java.util.Map;

public class Maratona {

    HashMap<Integer, Pessoa> circuitoPequeno = new HashMap<>();
    HashMap<Integer, Pessoa> circuitoMedio = new HashMap<>();
    HashMap<Integer, Pessoa> circuitoGrande = new HashMap<>();
    int inscricao = 1;

    public void inscreveMaratonista(String categoria, Pessoa pessoa) {
        switch (categoria) {
            case "pequeno":
                circuitoPequeno.put(inscricao++, pessoa);
                if (pessoa.getIdade() <= 18) {
                    pessoa.setValorInscricao(1300.0);
                } else {
                    pessoa.setValorInscricao(1500.0);
                }
                break;
            case "médio":
                circuitoMedio.put(inscricao++, pessoa);
                if (pessoa.getIdade() <= 18) {
                    pessoa.setValorInscricao(2000.0);
                } else {
                    pessoa.setValorInscricao(2300.0);
                }
                break;
            case "grande":
                circuitoGrande.put(inscricao++, pessoa);
                if (pessoa.getIdade() > 18) {
                    pessoa.setValorInscricao(2800.0);
                }
                break;
        }

    }

    public void mostraListaPorCategoria(String categoria) {
        switch (categoria) {
            case "pequeno":
                System.out.println("***********CATEGORIA PEQUENO CIRCUÍTO**************");
                for (Map.Entry<Integer, Pessoa> pessoaEntry : circuitoPequeno.entrySet()) {
                    System.out.println(pessoaEntry.getKey() + " - " + pessoaEntry.getValue().toString());
                }
                break;
            case "médio":
                System.out.println("***********CATEGORIA CIRCUÍTO MÉDIO**************");
                for (Map.Entry<Integer, Pessoa> pessoaEntry : circuitoMedio.entrySet()) {
                    System.out.println(pessoaEntry.getKey() + " - " + pessoaEntry.getValue().toString());
                }
                break;
            case "grande":
                System.out.println("***********CATEGORIA CIRCUÍTO GRANDE**************");
                for (Map.Entry<Integer, Pessoa> pessoaEntry : circuitoGrande.entrySet()) {
                    System.out.println(pessoaEntry.getKey() + " - " + pessoaEntry.getValue().toString());
                }
                break;
        }
    }

    public void cancelaInscricao(String categoria, int numeroInscricao) {
        switch (categoria) {
            case "pequeno":
                circuitoPequeno.remove(numeroInscricao);
                break;
            case "médio":
                circuitoMedio.remove(numeroInscricao);
                break;
            case "grande":
                circuitoGrande.remove(numeroInscricao);
                break;
        }
    }

}