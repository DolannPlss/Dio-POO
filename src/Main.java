import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;

public class Main {

	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setDescricao("curso inicial de java");
		curso.setTitulo("curso java");
		curso.setCargaHoraria(50);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("metoria teste");
		mentoria.setDescricao("primeiro teste para mentoria");
		mentoria.setData(LocalDate.now());

//		System.out.println(curso);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("java developer");
		bootcamp.setDescricao("descricao java developer");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Marcos");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());
		dev1.progredir();
		
		System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());
		System.out.println("Conteudos Concluidos: " + dev1.getConteudosConcluidos());
		System.out.println("Xp: " + dev1.calcularTotalXp());

		
		
		Dev dev2 = new Dev();
		dev2.setNome("Astolfo");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
		System.out.println("Conteudos Concluidos: " + dev2.getConteudosConcluidos());
	}

}
