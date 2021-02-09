package lista3;

import java.util.ArrayList;
import java.util.List;

public class OrdemDeServico {
		//Atributos
		private int codigo;
		private Cliente cliente;
		private ArrayList<Servico> servicos = new ArrayList<>();
		private ArrayList<Mecanico> mecanicos = new ArrayList<>();
		
		//Construtor
		public OrdemDeServico(int codigo, Cliente cliente) {
			
		}
		
		//Métodos
		public void adicionaServico(Servico servico) {
			
		}
		
		public void adicionaMecanico(Mecanico mecanico) {
			
		}
		
		public double calculaValorTotal() {
			return this.codigo;
		}
		
		public boolean possuiServico(int codigo) {
			return false;
		}
		
		public boolean possuiMecanico(String cpf) {
			return false;
		}
}
