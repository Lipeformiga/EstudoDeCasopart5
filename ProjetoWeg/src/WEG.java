/**
 * @author filipe_formigari
 * Essa classe e como objetivo criar todas as listas dos produtos e do serviço de manutenção para ser usado de apoio na classe main
 */
import java.util.ArrayList;

public class WEG {
	//criação das listas de produtos e serviço de manutenção
	private ArrayList <Gerador> geradores = new ArrayList<>();
	private ArrayList <InversorFrequencia> inversoresFrequencia = new ArrayList<>();
	private ArrayList <MotorEletrico> motoresEletricos = new ArrayList<>();
	private ArrayList <ServicoManutencao>  servicosManutencoes = new ArrayList<>();
	
	//métodos para adicionar um produto na arrayList
	//métodos para puxar a informação colocada pelo usuario
	public void addGerador (Gerador gerador){
	    this.geradores.add(gerador);
	}

	public void getGeradores(int indice){
	    this.geradores.get(indice);
	}
	public void addInversorDeFrequencia(InversorFrequencia inversorFrequencia){
	    this.inversoresFrequencia.add(inversorFrequencia);
	} 

	public void getInversor(int indice){
	    this.inversoresFrequencia.get(indice);
	}
	public void addMotorEletrico(MotorEletrico motorEletrico){
	    this.motoresEletricos.add(motorEletrico);
	}

	public void getMotoresEletricos(int indice){
	    this.motoresEletricos.get(indice);
	}
	public void addServicoDeManutencao(ServicoManutencao servicoManutencao){
	    this.servicosManutencoes.add(servicoManutencao);
	}

	public void getServicoDeManutencao(int indice){
	    this.servicosManutencoes.get(indice);
	}
	//métodos para puxar toda a lista dos objetos e do serviço de manutenção
	public ArrayList<Gerador> getGeradores() {
		return this.geradores;
	}
	
	public ArrayList<InversorFrequencia> getInversoresFrequencia() {
		return this.inversoresFrequencia;
	}
	
	public ArrayList<MotorEletrico> getMotoresEletricos() {
		return this.motoresEletricos;
	}
	
	public ArrayList<ServicoManutencao> getServicosManutencoes() {
		return this.servicosManutencoes;
	}
}