import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Conteudo;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHorario(72);
        

        Curso curso2 = new Curso();
        curso2.setTitulo ("curso .net");
        curso2.setDescricao("curso de .net");
        curso2.setCargaHorario(100);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("mentoria java");
        mentoria1.setData(LocalDate.now());

        //System.out.println (curso1);
        //System.out.println (curso2);
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        System.out.println("--------------------");


        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Lucas : " +devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("Conteúdos inscritos de Lucas : " +devLucas.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Lucas : " +devLucas.getConteudosConcluidos());
        System.out.println("XP: "+ devLucas.calcularXpTotal());


        System.out.println("-------------------------------------------------------------------");


        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Marcelo : " +devMarcelo.getConteudosInscritos());
        devMarcelo.progredir();
        devMarcelo.progredir();
        devMarcelo.progredir();

        System.out.println("Conteúdos inscritos de Marcelo : " +devMarcelo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Marcelo: " +devMarcelo.getConteudosConcluidos());
        System.out.println("XP: "+ devMarcelo.calcularXpTotal());


        

        
        
    }
    
}
