package br.com.dio.desafio;

public class Curso extends Conteudo {
    private int  cargoraria;

    public Curso() {
    }


    public int getCargoraria() {
        return cargoraria;
    }

    public void setCargoraria(int cargoraria) {
        this.cargoraria = cargoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargoraria=" + cargoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargoraria;
    }
}
