package lista3;

import java.util.ArrayList;
import java.util.List;

public class Oficina {
		//atributos
		private ArrayList<OrdemDeServico> ordensServico = new ArrayList<>();
		
		//Construtor
		public Oficina() {
			
		}
		
		//Métodos
		public void adicionaOS(OrdemDeServico os) {
			
		}
		
		public List<OrdemDeServico> buscaOsServico(int codigo) {
			return ordensServico;
			
		}
		
		public List<OrdemDeServico> buscaOsMecanico(String cpf) {
			return ordensServico;
			
		}
		
		public double calculaFaturamentoTotal() {
			return 0;
			
		}
		
}
