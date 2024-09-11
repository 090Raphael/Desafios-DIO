package src.main;
import java.time.LocalDate;

import src.Bootcamp;
import src.Curso;
import src.Dev;
import src.Mentoria;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Descrição do Curso Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJava2 = new Curso();
        Curso cursoJs;
        cursoJs.setTitulo("Curso JS");
        cursoJs.setDescricao("Descrição do Curso JS");
        cursoJs.setCargaHoraria(3);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria sobre Java");
        mentoriaJava.setDescricao("Discussão sobre boas práticas em Java");
        mentoriaJava.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para aprender Java do zero");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJs);
        bootcamp.getConteudos().add(mentoriaJava);

        Dev devRaphael = new Dev();
        devRaphael.setNome("Raphael");
        devRaphael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Raphael: " + devRaphael.getConteudosInscritos());
        devRaphael.progredir();
        System.out.println("Conteúdos concluídos Raphael: " + devRaphael.getConteudosConcluidos());
        System.out.println("XP: " + devRaphael.calcularTotalXp());

        System.out.println("--------");

        Dev devJheni = new Dev();
        devJheni.setNome("Jheni");
        devJheni.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jheni: " + devJheni.getConteudosInscritos());
        devJheni.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jheni: " + devJheni.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jheni: " + devJheni.getConteudosConcluidos());
        System.out.println("XP: " + devJheni.calcularTotalXp());

    }
}