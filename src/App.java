import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(800);
        curso1.setDescricao("este curso é sobre ser bacana");
        curso1.setTitulo("Curso de ser banaca");

        Curso curso2 = new Curso();
        curso2.setCargaHoraria(7);
        curso2.setDescricao("este curso é sobre JAVA");
        curso2.setTitulo("Java");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("Essa mentoria é sobre JAVA");
        mentoria1.setTitulo("Java");

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Jaca developer");
        bootcamp.setDescricao("bootcamp pra aprender Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev Nascimento = new Dev();
        Nascimento.setNome("nascimento");
        Nascimento.inscreverBootcamp(bootcamp);
        Nascimento.progredir();
        System.out.println("\nConteúdos inscritos" + Nascimento.getConteudosInscritos() + "\n");
        System.out.println("Conteúdos concluídos" + Nascimento.getConteudosConcluidos() + "\n\n");

        System.out.println("XP: " +  Nascimento.calcularTotalXp());
    }
}
