package lista3;

public class ServicoExe {

	public static void main(String[] args) {
		
		Servico serv1 = new Servico(1, "Conserto de geladeira", 240);
		serv1.status();
		
		Servico serv2 = new Servico(2, "Conserto de pia", 200.5f);
		serv2.status();
		
		Servico serv3 = new Servico(3, "Conserto de parede", 700.5f);
		serv3.status();
		
		Cliente cliente1 = new Cliente("\n11111", "22222", "Jorge\n");
		cliente1.status();
		
		Cliente cliente2 = new Cliente("33333", "44444", "Claudio\n");
		cliente2.status();

		Cliente cliente3 = new Cliente("55555", "66666", "Amira\n");
		cliente3.status();
		
	}

}
