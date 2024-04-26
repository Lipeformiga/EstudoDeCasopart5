/**
 * @author Filipe_Formigari
 * está é a classe principal onde será solicitado todas as informações para o usuario
 */

// Importa a classe Scanner.
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		// Cria um objeto Scanner para entrada de dados.
		Scanner sc = new Scanner(System.in);
		//Cria um objeto WEG chamado weg1
		WEG weg1 = new WEG();
		//Inicia um loop infinito.
		while(true) {
		//Exibe um menu de opções.
		System.out.println("O QUE DESEJA FAZER?"
				+ "\n( 1 - Cadastro motor Eletrico )"
				+ "\n( 2 - cadastro frequencia )"
				+ "\n( 3 - Cadastro gerador )"
				+ "\n( 4 - Cadastro serviço de manutenção )"
				+ "\n( 5 - Ver lista de serviços )"
				+ "\n( 6 - Ver lista motores elétricos )"
				+ "\n( 7 - Ver lista inversores de frequencia )"
				+ "\n( 8 - Ver lista Geradores )"
				+ "\n( 9 - Ver lista de todos os produtos cadastrados )");
		int escolha = sc.nextInt();
		
		//Inicia um bloco switch com base na escolha do usuário.
		switch(escolha) {
		//cadastro do motor elétrico
		case 1:
		
			System.out.println("quantos Motores deseja cadastrar");
			int tamanho = sc.nextInt();
			//repetição de acordo com quantos motores elétricos o usuario falou que vai cadastrar
			for (int cont = 0; cont < tamanho; cont++ ) {
				//cria um objeto MotorEletrico chamado m1
				MotorEletrico m1 = new MotorEletrico();
				
				//pede todas as informações do motor elétrico e passa por uma validaçãp caso passar na validação o valor será atribuido 
				do {
					System.out.println("codigo:");
				}	
				while (m1.setCodigo(sc.nextInt())!= true); 
				do {
					System.out.println("potência:");
				}	
				while (m1.setPotencia(sc.nextInt())!= true); 
				do {
					System.out.println("tensão:");
				}	
				while (m1.setTensao(sc.nextInt())!= true); 
				do {
					System.out.println("capacidade:");
				}	
				while (m1.setCapacidade(sc.nextInt())!= true); 
				do {
					System.out.println("preço:");
				}	
				while (m1.setPreco(sc.next())!= true); 
				do {
					System.out.println("tipo de enrolamento:");
					sc.nextLine();
				}	
				while (m1.setTipoEnrolamento(sc.nextLine())!= true); 
				do {
					System.out.println("Eficiência:");
				}	
				while (m1.setEficiência(sc.nextInt())!= true); 
				//Adiciona o motor elétrico à lista de motores elétricos da instância weg1
				weg1.addMotorEletrico(m1);
			}
			break;
			
		case 2:
			
			System.out.println("quantos Geradores deseja cadastrar");
			int tamanho2 = sc.nextInt();
			//repetição de acordo com quantos geradores o usuario falou que vai cadastrar
			for (int cont = 0; cont < tamanho2; cont++ ) {
				//cria um objeto Gerador chamado g1
				Gerador g1 = new Gerador();
				//pede todas as informações do gerador e passa por uma validaçãp caso passar na validação o valor será atribuido 
				do {
					System.out.println("codigo:");
				}	
				while (g1.setCodigo(sc.nextInt())!= true); 
				do {
					System.out.println("potência:");
				}	
				while (g1.setPotencia(sc.nextInt())!= true); 
				do {
					System.out.println("tensão:");
				}	
				while (g1.setTensao(sc.nextInt())!= true); 
				do {
					System.out.println("capacidade:");
				}	
				while (g1.setCapacidade(sc.nextInt())!= true); 
				do {
					System.out.println("preço:");
				}	
				while (g1.setPreco(sc.next())!= true); 
				do {
					System.out.println("tipo de combustível (1- gasolina)(2- Alcool)(3- Etanol):");
				}	
				while (g1.setTipoCombustível(sc.nextInt())!= true); 
				do {
					System.out.println("autonomia em KM:");
				}	
				while (g1.setAutonomia(sc.nextDouble())!= true); 
				//Adiciona o gerador à lista de geradores da instância weg1
				weg1.addGerador(g1);
			}
			break;
			
		case 3:
			
			System.out.println("quantos Inversores de frequência deseja cadastrar");
			int tamanho3 = sc.nextInt();
			//repetição de acordo com quantos inversores de frequência o usuario falou que vai cadastrar
			for (int cont = 0; cont < tamanho3; cont++ ) {
				//cria um objeto InversorFrequencia chamado i1
				InversorFrequencia i1 = new InversorFrequencia();
				
				/** pede todas as informações do Inversor de Frequência e passa por uma 
				 * validaçãp caso passar na validação o valor será atribuido, se não será pedido denovo
				 * a mesma pergunta até o usuario colocar o valor corretamente
				 */
				do {
					System.out.println("codigo:");
				}	
				while (i1.setCodigo(sc.nextInt())!= true); 
				do {
					System.out.println("potência:");
				}	
				while (i1.setPotencia(sc.nextInt())!= true); 
				do {
					System.out.println("tensão:");
				}	
				while (i1.setTensao(sc.nextInt())!= true); 
				do {
					System.out.println("capacidade:");
				}	
				while (i1.setCapacidade(sc.nextInt())!= true); 
				do {
					System.out.println("preço:");
				}	
				while (i1.setPreco(sc.next())!= true); 
				do {
					System.out.println("Capacidade frequencia:");
				}	
				while (i1.setCapacidadeFrequência(sc.next())!= true); 
				do {
					System.out.println("Número de fases:");
				}	
				while (i1.setNumeroFases(sc.nextInt())!= true); 
				//Adiciona o inversor de frequencia à lista de inversores de frequência da instância weg1
				weg1.addInversorDeFrequencia(i1);
			}
			break;
			
		case 4:
			//cria um objeto ServicoManutencao chamado sm1
			ServicoManutencao sm1 = new ServicoManutencao();
			
			//pede em qual produto será realizado o serviço para fazer sua devida atribuição
			System.out.println("deseja realizar um serviço de manutenção em qual produto?"
					+ "\n (1- Motor Elétrico)(2- Gerador)(3- Inversor de frequência)");
			sm1.setOpcao(sc.nextInt());
			
			//pede todas as informações do serviço de manutção e passa por uma validaçãp caso passar na validação o valor será atribuido
			do {
				System.out.println("descrição do serviço:");
				sc.nextLine();
			}
			while(sm1.setDescricao(sc.nextLine())!= true);
			do {
				System.out.println("custo do serviço:");
			}
			while(sm1.setCusto(sc.nextDouble())!= true);
			
			//Adiciona o serviço de manutenção à lista de serviços de manutenções da instância weg1
			weg1.addServicoDeManutencao(sm1);
			break;
			
		case 5:
			// puxa a lista de serviços de manutenção e exibe suas informações
			for ( ServicoManutencao servico : weg1.getServicosManutencoes()) {
				System.out.println("lista de serviço de manutenção com seus devidos produtos:");
				System.out.println(servico.toString());
			}
			break;
			
		case 6:
			int cont = 0;
			// puxa a lista de motores elétricos e exibe suas informações
			for (MotorEletrico motor : weg1.getMotoresEletricos()) {
				cont++;
				System.out.println("Motor "+ cont);
				System.out.println(motor.toString());
			}
			break;
			
		case 7:
			// puxa a lista de geradores e exibe suas informações
			int cont1 = 0;
			for (Gerador gerador : weg1.getGeradores()) {
				cont1++;
				System.out.println("Gerador "+ cont1);
				System.out.println(gerador.toString());
			}
			break;
		case 8:
			// puxa a lista de inversores de frequência e exibe suas informações
			int cont2 = 0;
			for (InversorFrequencia inversor : weg1.getInversoresFrequencia()) {
				cont2++;
				System.out.println("Inversor de frequência "+ cont2);
				System.out.println(inversor.toString());
			}
			break;
		//Exibe as informações sobre todos os produtos cadastrados
		case 9:
			//Exibe informações sobre os motores elétricos
			int cont4 = 0;
			for (MotorEletrico motor : weg1.getMotoresEletricos()) {
				cont4++;
				System.out.println("Motor "+ cont4);
				System.out.println(motor.toString()+ "\n");
			}
			// Exibe informações sobre os geradores
			int cont5 = 0;
			for (Gerador gerador : weg1.getGeradores()) {
				cont5++;
				System.out.println("Gerador "+ cont5);
				System.out.println(gerador.toString() + "\n");
			}
			// Exibe informações sobre os inversores de frequência
			int cont6 = 0;
			for (InversorFrequencia inversor : weg1.getInversoresFrequencia()) {
				cont6++;
				System.out.println("Inversor de frequência "+ cont6);
				System.out.println(inversor.toString()+ "\n");
			}
			break;
			}
		}
	}
}