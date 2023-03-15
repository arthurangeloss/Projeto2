package br.com.estoque;

public class MainEstoque {
    public static void main(String[] args) {
        Estoque e1= new Estoque();
        e1.setNome("Caneta");
        e1.setQtdAtual(18);
        e1.setQtdMinima(5);
        System.out.println(e1.mostra());
    }
}
