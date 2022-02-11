package trabalho.poo.modelo;

public class Matricula {

	private int numero;
	private boolean ativa;
	private Aluno aluno;
	private Turma turma;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Matricula(int numero, boolean ativa) {
		this.numero = numero;
		this.ativa = ativa;
	}

	public Matricula(int numero, boolean ativa, Aluno aluno, Turma turma) {
		this.numero = numero;
		this.ativa = ativa;
		this.aluno = aluno;
		this.turma = turma;
	}

}
