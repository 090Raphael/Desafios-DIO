import java.time.LocalDate;
// classes modelo
import modelo.Bootcamp;
import modelo.Curso;
import modelo.Dev;
import modelo.Mentoria;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Descrição do Curso Java");
        cursoJava.setCargaHoraria(8);

        Curso cursojs = new Curso();
        cursojs.setTitulo("Curso de Js");
        /* cursojs.setDescricao("Descrição do Curso Js"); add novo curso*/
        cursojs.setCargaHoraria(3);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria sobre Java");
        mentoriaJava.setDescricao("Discussão sobre boas práticas em Java");
       /* mentoriaJava.setDescricao("Discussão sobre boas práticas em Js"); add novo curso*/
        mentoriaJava.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para aprender Java do zero");
        bootcamp.getConteudos().add(cursoJava);
       /* bootcamp.getConteudos().add(cursojs); add novo curso*/
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
