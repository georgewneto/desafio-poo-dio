import br.com.dio.desafio.dominio.*;

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

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso Spring Data");
        curso3.setDescricao("descrição curso Spring Data");
        curso3.setCargaHoraria(4);

        Curso curso4 = new Curso();
        curso4.setTitulo("Curso Spring framework / MVC");
        curso4.setDescricao("descrição curso Spring framework / MVC");
        curso4.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Formacao formacaoJava = new Formacao();
        formacaoJava.setNome("Java Developer");
        formacaoJava.setDescricao("Formação completa em Java");
        formacaoJava.getConteudos().add(curso1);
        formacaoJava.getConteudos().add(curso3);
        formacaoJava.getConteudos().add(curso4);

        Dev devGeorge = new Dev();
        devGeorge.setNome("George W. Neto");
        devGeorge.inscrever(formacaoJava);//Bootcamp ou Formação
        System.out.println("Conteúdos Inscritos George:" + devGeorge.getConteudosInscritos());


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscrever(bootcamp);//Bootcamp ou Formação
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscrever(bootcamp); //Bootcamp ou Formação
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());



    }

}
