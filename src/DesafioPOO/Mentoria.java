package DesafioPOO;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    @Override
    public double calcularXp() {
        return 0;
    }

    private LocalDate data;

    public Mentoria() {
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
}
