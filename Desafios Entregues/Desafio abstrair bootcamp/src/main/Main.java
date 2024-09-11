package main;

import java.time.LocalDate;
import modelo.Bootcamp;
import modelo.Curso;
import modelo.Dev;
import modelo.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Descrição do Curso Java");
        cursoJava.setCargaHoraria(8);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria sobre Java");
        mentoriaJava.setDescricao("Discussão sobre boas práticas em Java");
        mentoriaJava.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para aprender Java do zero");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(mentoriaJava);

        Dev devRaphael = new Dev();
        devRaphael.setNome("Raphael");
        devRaphael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Raphael: " + devRaphael.getConteudosInscritos());
        devRaphael.progredir();
        System.out.println("Conteúdos concluídos Raphael: " + devRaphael.getConteudosConcluidos());
        System.out.println("XP: " + devRaphael.calcularTotalXp());

        System.out.println("--------");
    }
}
