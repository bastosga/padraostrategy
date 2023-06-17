package org.example;

public class AluguelCarro{
    private float valorAluguel;

    public float getValorAluguel(){
        return this.valorAluguel;
    }

    public void calcularPrecoDuracaoFixa(float precoPorDia, int qtdDias) {
        Calculadora calculadora = new Calculadora(precoPorDia, qtdDias);
        this.valorAluguel = calculadora.calcular(new OperacaoPrecoFixo());
    }

    public void calcularPrecoDuracaoVariavel(float  precoPorHora, float qtdHoras) {
        Calculadora calculadora = new Calculadora(precoPorHora, qtdHoras);
        this.valorAluguel = calculadora.calcular(new OperacaoPrecoVariado());
    }
}