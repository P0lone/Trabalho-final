package trabalho.poo.modelo;

public class Turma {

	private int alunosMatriculados;
	private int numeroMinimo;
	private String nomeTurma;
	private Curso curso;

	public int getAlunosMatriculados() {
		return alunosMatriculados;
	}

	public void setAlunosMatriculados(int alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}

	public int getNumeroMinimo() {
		return numeroMinimo;
	}

	public void setNumeroMinimo(int numeroMinimo) {
		this.numeroMinimo = numeroMinimo;
	}

	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Turma(int alunosMatriculados, int numeroMinimo, String nomeTurma) {
		this.alunosMatriculados = alunosMatriculados;
		this.numeroMinimo = numeroMinimo;
		this.nomeTurma = nomeTurma;
	}
	
	public Turma(int alunosMatriculados, int numeroMinimo, String nomeTurma, Curso curso) {
		this.alunosMatriculados = alunosMatriculados;
		this.numeroMinimo = numeroMinimo;
		this.nomeTurma = nomeTurma;
		this.curso = curso;
	}
	
}
