package DesafioPOO;

import DesafioPOO.Classes.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java focado em back-end");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Curso de Python focado em Ciência de Dados");
        curso2.setCargaHoraria(13);


    }
}
