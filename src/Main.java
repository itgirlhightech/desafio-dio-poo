import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Curso curso1 = new Curso();
       curso1.setTitulo("Curso Java");
       curso1.setDescricao("descrição curso java");
       curso1.setCargoraria(8);

       Curso curso2 = new Curso();
       curso2.setTitulo("Curso Js");
       curso2.setDescricao("descrição curso java");
       curso1.setCargoraria(10);

       Mentoria mentoria = new Mentoria();
       mentoria.setTitulo("mentoria de java");
       mentoria.setDescricao("descricao mentoria");
       mentoria.setData(LocalDate.now());

       System.out.println(curso1);
       System.out.println(curso2);
       System.out.println(mentoria);

    }
}
