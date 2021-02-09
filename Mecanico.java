package lista3;

public class Mecanico {
	//Atributos
	private String especialidade;
	
	//Construtor
	public Mecanico(String espec, String cpf, String nome) {
		this.especialidade = espec;
	}
	
	//Gets Sets
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
}

