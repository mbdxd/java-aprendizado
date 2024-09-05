package Test;

import JUnit.Pessoa;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AssertionsTeste    {

@Test
public void ValidarLancamentos() {
    int[] primeiroLancamento = {10, 20, 30, 40, 50};
    int[] segundoLancamento = {50, 2, 3, 10, 16};

    Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);

    }

    @Test
    void validarObjetoNulo() {
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDate.of(2020, 1, 1));
        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarNumeroDeTiposDiferentes() {

    double valor = 5.0;
    double outroValor = 5.0;

    Assertions.assertEquals(valor, outroValor);
    }
}
