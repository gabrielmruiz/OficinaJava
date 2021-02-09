package lista3;

public class Servico {
		//Atributos
		private int codigo;
		private String nome;
		private double valor;
		
		//Construtor
		public Servico(int c, String n, double v) {
			this.codigo = c;
			this.nome = n;
			this.valor = v;
		}
		
		//Gets Sets
		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}
		
		//personalizados
		public void status() {
			System.out.println(this.codigo);
			System.out.println(this.nome);
			System.out.println(this.valor);
		}
}
