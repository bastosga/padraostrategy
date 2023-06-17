package org.example;
public class OperacaoPrecoFixo implements Operacao {

    @Override
    public float calcular(float valor1, float valor2) {
        return valor1 * valor2;
    }
}