package br.com.desafio;

import br.com.desafio.dominio.*;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        // Criando um Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Um bootcamp para se tornar um desenvolvedor Java.");

        // Criando Cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java Básico");
        curso1.setDescricao("Aprenda os fundamentos de Java.");
        curso1.setCargaHoraria(30);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Java Avançado");
        curso2.setDescricao("Aprofunde-se em Java.");
        curso2.setCargaHoraria(40);

        // Adicionando cursos ao Bootcamp
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        // Criando uma Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria sobre boas práticas em Java.");
        mentoria.setData(LocalDate.now());
        
        // Adicionando mentoria ao Bootcamp
        bootcamp.getConteudos().add(mentoria);

        // Criando Desenvolvedores
        Dev dev1 = new Dev();
        dev1.setNome("Aluno 01");

        Dev dev2 = new Dev();
        dev2.setNome("Aluno 02");

        // Inscrevendo desenvolvedores no Bootcamp
        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        // Progredindo nos conteúdos
        dev1.progredir();
        dev1.progredir(); // Dev1 avança mais um conteúdo
        dev2.progredir(); // Dev2 avança apenas um conteúdo

        // Calculando e mostrando XP dos desenvolvedores
        System.out.println("XP de " + dev1.getNome() + ": " + dev1.calcularXp());
        System.out.println("XP de " + dev2.getNome() + ": " + dev2.calcularXp());

        // Exibindo conteúdos inscritos e concluídos
        System.out.println(dev1.getNome() + " - Conteúdos Inscritos: " + dev1.getConteudoInscrito());
        System.out.println(dev1.getNome() + " - Conteúdos Concluídos: " + dev1.getConteudoConcluido());
        
        System.out.println(dev2.getNome() + " - Conteúdos Inscritos: " + dev2.getConteudoInscrito());
        System.out.println(dev2.getNome() + " - Conteúdos Concluídos: " + dev2.getConteudoConcluido());
    }
}

