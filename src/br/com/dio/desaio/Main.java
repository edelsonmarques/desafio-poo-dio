package br.com.dio.desaio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso de Orientação a Objeto");
        curso.setDescricao("Aprenda de uma vez por toda sobre Orientação a Objeto");
        curso.setCargaHoraria(3);

        /*System.out.println(curso);
        System.out.println(curso.calcularXp());*/

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria: Primeiros Passos na Programação");
        mentoria.setDescricao("Mentoria destinada para pessoas iniciantes na programação");
        mentoria.setData(LocalDate.now());

     /*   System.out.println(mentoria);
        System.out.println(mentoria.calcularXp());*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para quem deseja ser um desenvolvedor Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev desenvolvedor = new Dev();
        desenvolvedor.setNome("João Dev");

        desenvolvedor.inscreverBootcamp(bootcamp);
        System.out.println("Inscrito: "+desenvolvedor.getConteudosInscritos());
        desenvolvedor.progredir();
        System.out.println("Inscrito: "+desenvolvedor.getConteudosInscritos());
        System.out.println("Concluido: "+ desenvolvedor.getConteudosConcluidos());
        System.out.println("XP: "+ desenvolvedor.calcularTotalXp());
        desenvolvedor.progredir();
        System.out.println("XP: "+ desenvolvedor.calcularTotalXp());

    }
}
