import br.com.dio.desafio.*;

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
       curso2.setCargoraria(10);

       Mentoria mentoria = new Mentoria();
       mentoria.setTitulo("mentoria de java");
       mentoria.setDescricao("descricao mentoria");
       mentoria.setData(LocalDate.now());

       /*System.out.println(curso1);
       System.out.println(curso2);
       System.out.println(mentoria);
        */

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descricao vai aqui");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);

       Dev devEvilyn = new Dev();
       devEvilyn.setNome("Evilyn");
       devEvilyn.inscreverBootcamp(bootcamp);
       System.out.println("Conteudos inscritos Evilyn: " + devEvilyn.getConteudosInscritos());
       devEvilyn.progredir();
       devEvilyn.progredir();
       System.out.println("-");
       System.out.println("Conteudos inscritos: " + devEvilyn.getConteudosInscritos());
       System.out.println("Conteudos concluidos: " + devEvilyn.getConteudosConcluidos());
       System.out.println("XP: " + devEvilyn.calcularxp());


       System.out.println("-------------");

       Dev devStuart = new Dev();
       devStuart.setNome("Struart");
       devStuart.inscreverBootcamp(bootcamp);
       System.out.println("Conteudos concluidos Stuart:" + devStuart.getConteudosInscritos());
       devStuart.progredir();
       devStuart.progredir();
       devStuart.progredir();
       System.out.println("-");
       System.out.println("Conteudos inscritos:" + devStuart.getConteudosInscritos());
       System.out.println("Conteudos concluidos:" + devStuart.getConteudosConcluidos());
       System.out.println("XP: " + devStuart.calcularxp());





    }
}
