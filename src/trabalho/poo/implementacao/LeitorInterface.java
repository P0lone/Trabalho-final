package trabalho.poo.implementacao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import trabalho.poo.modelo.*;
import trabalho.poo.interfaces.ITrabalhoPOO;

public class LeitorInterface implements ITrabalhoPOO {

	@Override
	public Aluno lerDadosAluno() {
		
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno:");
		String endereco = JOptionPane.showInputDialog("Informe o endereço do aluno:");
		String dtNsc = JOptionPane.showInputDialog("Informe a data de nascimento do aluno:");
		String telefone = JOptionPane.showInputDialog("Informe o telefone do aluno:");
		int dtIngressao = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de ingressão do aluno"));
		Aluno aluno = new Aluno(nome, endereco, dtNsc, telefone, dtIngressao);
		return aluno;
	}

	@Override
	public Professor lerDadosProfessor() {
		
		String nome = JOptionPane.showInputDialog("Informe nome do professor:");
		String endereco = JOptionPane.showInputDialog("Informe o endereço do professor:");
		String dtNsc = JOptionPane.showInputDialog("Informe a data de nascimento do professor:");
		String telefone = JOptionPane.showInputDialog("Informe o telefone do professor:");
		String siape = JOptionPane.showInputDialog("Informe o siape do professor:");
		Professor professor = new Professor(nome, endereco, dtNsc, telefone, siape);
		return professor;
	}

	@Override
	public Curso lerDadosCurso() {
		
		String nome = JOptionPane.showInputDialog("Informe nome do curso:");
		Curso curso = new Curso(nome);
		return curso;
		
	}

	@Override
	public Turma lerDadosTurma() {
		
		String nome = JOptionPane.showInputDialog("Informe nome da turma:");
		int matriculado = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de matriculados na turma"));
		int min = Integer.parseInt(JOptionPane.showInputDialog("Informe o minimo de alunos possiveis da turma"));
		Turma turma = new Turma(matriculado, min, nome);
		return turma;
		
	}

	@Override
	public Turma lerDadosTurma(Curso curso) {
		
		String nome = JOptionPane.showInputDialog("Informe nome da turma:");
		int matriculado = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de matriculados na turma"));
		int min = Integer.parseInt(JOptionPane.showInputDialog("Informe o minimo de alunos possiveis da turma"));
		Turma turma = new Turma(matriculado, min, nome, curso);
		return turma;
		
	}

	@Override
	public Disciplina lerDadosDisciplina() {
		
		String nome = JOptionPane.showInputDialog("Informe nome da disciplina:");
		int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe carga horaria:"));
		Disciplina disciplina = new Disciplina(nome, cargaHoraria);
		return disciplina;
		
	}

	@Override
	public Disciplina lerDadosDisciplina(Professor professor, Turma turma) {
		
		String nome = JOptionPane.showInputDialog("Informe nome da disciplina:");
		int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe carga horaria:"));
		Disciplina disciplina = new Disciplina(nome, cargaHoraria, professor, turma);
		return disciplina;
		
	}

	@Override
	public Matricula lerDadosMatricula() {
		int ra = Integer.parseInt(JOptionPane.showInputDialog("Informe numero da matricula"));
		Boolean ativo = false;
		int resposta = JOptionPane.showConfirmDialog(null,"A matricula está ativa?" , "Matricula", JOptionPane.YES_NO_OPTION);
		if (resposta == 0) {
			ativo = true;
			
		}else {
			ativo = false;
			
		}
		Matricula matricula = new Matricula(ra, ativo);
		return matricula;
		
	}

	@Override
	public Matricula lerDadosMatricula(Aluno aluno, Turma turma) {
		int ra = Integer.parseInt(JOptionPane.showInputDialog("Informe numero da matricula"));
		Boolean ativo = false;
		int resposta = JOptionPane.showConfirmDialog(null,"A matricula está ativa?" , "Matricula", JOptionPane.YES_NO_OPTION);
		if (resposta == 0) {
			ativo = true;
			
		}else {
			ativo = false;
			
		}
		Matricula matricula = new Matricula(ra, ativo, aluno, turma);
		return matricula;
		
	}

	@Override
	public void listarMatriculasAtivas(ArrayList<Matricula> matriculas) {
		
		System.out.println("______MATRICULAS_ATIVAS_______");
		System.out.println();
		
		for (Matricula matricula : matriculas){
			
			if(matricula.isAtiva()) {
				
				System.out.println("Numero da matricula: " + matricula.getNumero());
				System.out.println("Nome do aluno: " + matricula.getAluno().getNome());
				System.out.println("Numero da turma: " + matricula.getTurma().getNomeTurma());
				
			}
			
		}
		
		System.out.println();
	
	}

	@Override
	public void listarTodasMatriculas(ArrayList<Matricula> matriculas) {
		
		System.out.println("________TODAS_MATRICULAS_____");
		System.out.println();
		
		for (Matricula matricula : matriculas){
			
			System.out.println("Numero da matricula: " + matricula.getNumero());
			System.out.println("Matricula está ativa: " + matricula.isAtiva());
			System.out.println("Nome do aluno: " + matricula.getAluno().getNome());
			System.out.println("Numero da turma: " + matricula.getTurma().getNomeTurma());
			
		}

		System.out.println();
		
	}

	@Override
	public void listarAlunos(ArrayList<Aluno> alunos) {
		
		System.out.println("_____________ALUNOS___________");
		System.out.println();
		
		for (Aluno aluno : alunos) {
			
			aluno.imprimirDados();
			
		}
		
		System.out.println();

	}

	@Override
	public void listarTurmas(ArrayList<Turma> turmas) {
		
		System.out.println("____________TURMAS____________");
		System.out.println();
		
		for (Turma turma : turmas){
			
			System.out.println("Nome da turma: " + turma.getNomeTurma());
			System.out.println("Minimo de alunos: " + turma.getNumeroMinimo());
			System.out.println("Alunos matriculados: " + turma.getAlunosMatriculados());
			System.out.println("Curso da turma: " + turma.getCurso().getNome());
			
		}
		
		System.out.println();
		
	}

	@Override
	public void listarProfessores(ArrayList<Professor> professores) {
		
		System.out.println("__________PROFESSORES_________");
		System.out.println();
		
		for (Professor professor : professores) {
			
			professor.imprimirDados();
			
		}
		
		System.out.println();

	}

	@Override
	public void listarDisciplinas(ArrayList<Disciplina> disciplinas) {
		
		System.out.println("_________DISCIPLINAS__________");
		System.out.println();
		
		for (Disciplina disciplina : disciplinas){
			
			System.out.println("Nome da disciplina: " + disciplina.getNome());
			System.out.println("Carga horaria da disciplina: " + disciplina.getCargaHoraria());
			System.out.println("Turma da disciplina: " + disciplina.getTurma().getNomeTurma());
			System.out.println("Professor da disciplina: " + disciplina.getProfessor().getNome());
			
		}
		
		System.out.println();
		
	}

	@Override
	public void listarCursos(ArrayList<Curso> cursos) {

		System.out.println("____________CURSOS____________");
		System.out.println();
		
		for (Curso curso : cursos){
			
			System.out.println("Nome do curso: " + curso.getNome());
			
		}
		
		System.out.println("______________________________");
		
	}
	
	
	
}
