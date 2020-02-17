package br.com.patricia.designpatterns.decorator;

public class TesteImpostoDecorator {
    public static void main(String[] args) {
        Imposto iss = new ISS(new ICMS());

        Orcamento orcamento = new Orcamento(500.0);

        System.out.println(iss.calcula(orcamento));
    }
}
