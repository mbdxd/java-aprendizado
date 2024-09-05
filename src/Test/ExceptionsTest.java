package Test;

import JUnit.Conta;
import JUnit.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void     validarCenarioDeExcecaoNaTransferencia() {
        Conta miguel = new Conta("Miguel", 0);
        Conta contaDestino  = new Conta("Matheus", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(miguel,contaDestino, -1));

    }

}
