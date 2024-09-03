package Test;

import JUnit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class PessoaTeste {

    @Test
    public void validarCalculoDeIdade() {
        Pessoa julia = new Pessoa("Julia", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(4, julia.getIdade());

    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa maria = new Pessoa("Maria", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(maria.ehMaiorDeIdade());

        Pessoa julia = new Pessoa("Julia", LocalDate.of(2020, 1, 1));
        Assertions.assertFalse(julia.ehMaiorDeIdade());
    }
}
