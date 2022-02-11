package trabalho.poo.teste;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import trabalho.poo.implementacao.LeitorInterface;
import trabalho.poo.interfaces.ITrabalhoPOO;
import trabalho.poo.modelo.*;

public class testePOO{

	public static void main(String[] args) {
		
		ITrabalhoPOO poo = new LeitorInterface();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Professor> profs = new ArrayList<Professor>();
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
		ArrayList<Turma> turmas = new ArrayList<Turma>();
		
		Aluno aluno = poo.lerDadosAluno();
		Professor prof = poo.lerDadosProfessor();
		Curso curso = poo.lerDadosCurso();
		Turma turma = poo.lerDadosTurma(curso);
		Disciplina disciplina = poo.lerDadosDisciplina(prof, turma);
		Matricula matricula = poo.lerDadosMatricula(aluno, turma);
		alunos.add(aluno);
		profs.add(prof);
		cursos.add(curso);
		turmas.add(turma);
		disciplinas.add(disciplina);
		matriculas.add(matricula);
		
		poo.listarMatriculasAtivas(matriculas);
		poo.listarTodasMatriculas(matriculas);
		poo.listarAlunos(alunos);
		poo.listarTurmas(turmas);
		poo.listarProfessores(profs);
		poo.listarDisciplinas(disciplinas);
		poo.listarCursos(cursos);

	}

}
