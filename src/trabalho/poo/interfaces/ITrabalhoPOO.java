package trabalho.poo.interfaces;

import java.util.ArrayList;

import trabalho.poo.modelo.Aluno;
import trabalho.poo.modelo.Curso;
import trabalho.poo.modelo.Disciplina;
import trabalho.poo.modelo.Matricula;
import trabalho.poo.modelo.Professor;
import trabalho.poo.modelo.Turma;

public interface ITrabalhoPOO {
	
	Aluno lerDadosAluno();
	Professor lerDadosProfessor();
	Curso lerDadosCurso();
	Turma lerDadosTurma();
	Turma lerDadosTurma(Curso curso);
	Disciplina lerDadosDisciplina();
	Disciplina lerDadosDisciplina(Professor professor, Turma turma);
	Matricula lerDadosMatricula();
	Matricula lerDadosMatricula(Aluno aluno, Turma turma);
	
	void listarMatriculasAtivas(ArrayList<Matricula> matriculas);
	void listarTodasMatriculas(ArrayList<Matricula> matriculas);
	void listarAlunos(ArrayList<Aluno> alunos);
	void listarTurmas(ArrayList<Turma> turmas);
	void listarProfessores(ArrayList<Professor> preofessores);
	void listarDisciplinas(ArrayList<Disciplina> disciplinas);
	void listarCursos(ArrayList<Curso> cursos);
	
}
