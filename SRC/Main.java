import java.time.LocalDate;
import br_com_dio_desafio.dominio.*;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);
    
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        
        Dev devVal = new Dev();
        devVal.setNome("Val");
        devVal.InscreverBootcamp(bootcamp);
        System.out.println("-----------------------------------");
        System.out.println("Dev Val");
        System.out.println("Conteúdos Inscritos" + devVal.getConteudosInscritos());
        devVal.progredir();
        devVal.progredir();
        System.out.println("Cursos Inscritos" + devVal.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devVal.getConteudosConcluidos());
        System.out.println("XP: " + devVal.calcularTotalXp() + "%");

        