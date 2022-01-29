import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria de java");
        mentoria1.setData(LocalDate.now());

/*        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAlexandre = new Dev();
        devAlexandre.setNome("Alexandre");
        devAlexandre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Alexandre: " + devAlexandre.getConteudosInscritos());

        devAlexandre.progredir();
        devAlexandre.progredir();
        devAlexandre.progredir();
        System.out.println("----");
        System.out.println("Conteúdos inscritos Alexandre: " + devAlexandre.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Alexandre: " + devAlexandre.getConteudosConcluidos());
        System.out.println("XP: " + devAlexandre.calcularTotalXP());

        System.out.println("---------------");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Carlos: " + devCarlos.getConteudosInscritos());

        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("----");
        System.out.println("Conteúdos inscritos Carlos: " + devCarlos.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Carlos: " + devCarlos.getConteudosConcluidos());
        System.out.println("XP: " + devCarlos.calcularTotalXP());
    }
}
