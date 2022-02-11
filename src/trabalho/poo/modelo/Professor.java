package trabalho.poo.modelo;

public final class Professor extends Pessoa {

	private String siape;

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

	public Professor(String nome) {
		super();
		
	}

	public Professor(String nome, String endereco, String dataNascimento, String telefoneContato, String siape) {
		super(nome, endereco, dataNascimento, telefoneContato);
		this.siape = siape;
		
	}

	@Override
	public void imprimirDados() {
		
		System.out.println("Nome do professor: "+ getNome());
		System.out.println("Endereco do professor: "+ getEndereco());
		System.out.println("Data de Nascimento do professor: "+ getDataNascimento());
		System.out.println("Telefone do professor: " + getTelefoneContato());
		System.out.println("Data de ingressão do professor: " + getSiape());

	}

}
