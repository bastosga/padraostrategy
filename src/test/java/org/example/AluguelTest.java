import org.example. *;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AluguelTest {

    @Test
    void deveRealizarOperacaoPrecoFixo() {
        AluguelCarro aluguelCarro = new AluguelCarro();
        aluguelCarro.calcularPrecoDuracaoFixa(100.0f, 10);
        assertEquals(1000.0f, aluguelCarro.getValorAluguel());
    }

    @Test
    void deveRealizarOperacaoPrecoVariado() {
        AluguelCarro aluguelCarro = new AluguelCarro();
        aluguelCarro.calcularPrecoDuracaoVariavel(10.0f, 10);
        assertEquals(150.0f, aluguelCarro.getValorAluguel());
    }


}