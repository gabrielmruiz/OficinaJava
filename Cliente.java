package lista3;

public class Cliente extends Pessoa {
	//Atributos
	private String telefone;
		
	//Método Construtor

	public Cliente(String telefone, String cpf, String nome) {
		super(cpf, nome);
		this.telefone = telefone;
	}
	
	//Gets Sets
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String tel) {
		this.telefone = tel;
	}
	
	//personalizados 
	public void status() {
		System.out.println(this.telefone);
		System.out.println(super.getCpf());
		System.out.println(super.getNome());
	}
}