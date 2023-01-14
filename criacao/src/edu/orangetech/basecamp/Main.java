package edu.orangetech.basecamp;
public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("\nExercícios Calculadora");
        Calculadora.soma(2,5);
        Calculadora.subtracao(2,5);
        Calculadora.multiplicacao(2,5);
        Calculadora.divisao(2,5);

        System.out.println("\nExercícios Mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(21);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(32);

        System.out.println("\nExercícios Empréstimo");
        Emprestimo.calcular(1000.00, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000.00, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000.00, 5);
    }


    
}
