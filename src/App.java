import java.time.LocalDate;
import java.util.Set;

import javax.print.event.PrintEvent;

import br.com.dio.desafio.dominio.Curso;
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
        mentoria1.setDescricao("este curso é sobre JAVA");
        mentoria1.setTitulo("Java");

        System.out.println(curso1 + "\n" + curso2 + "\n" + mentoria1);
    }
}
