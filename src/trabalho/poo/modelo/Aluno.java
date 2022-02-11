package trabalho.poo.modelo;

public final class Aluno extends Pessoa {

	private int anoDeIngresso;

	public int getAnoDeIngresso() {
		return anoDeIngresso;
	}

	public void setAnoDeIngresso(int anoDeIngresso) {
		this.anoDeIngresso = anoDeIngresso;
	}

	public Aluno(String nome) {
		super();

	}

	public Aluno(String nome, String endereco, String dataNascimento, String telefoneContato, int ingre) {
		super(nome, endereco, dataNascimento, telefoneContato);
		this.anoDeIngresso = ingre;

	}

	@Override
	public void imprimirDados() {
		
		System.out.println("Nome do aluno: "+ getNome());
		System.out.println("Endereco do aluno: "+ getEndereco());
		System.out.println("Data de Nascimento do aluno: "+ getDataNascimento());
		System.out.println("Telefone do aluno: " + getTelefoneContato());
		System.out.println("Data de ingressão do aluno: " + getAnoDeIngresso());

	}

}
