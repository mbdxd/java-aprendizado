package JUnit;

import java.util.logging.Logger;

public class BancoDeDados {
    public static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        //fez algo
        LOGGER.info("Iniciou conexao.");
    }
    public static void finalizarConexao() {
        //fez algo
        LOGGER.info("Finalizou conexao.");
    }

    public static void insereDados(Pessoa pessoa) {
        //insere pessoa no bd
        LOGGER.info("inseriu dados");
    }
    public static void removeDados(Pessoa pessoa) {
        //remove pessoa no bd
        LOGGER.info("remove dados");
    }

}
