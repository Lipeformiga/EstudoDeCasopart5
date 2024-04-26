/**
 * 
 * @author filipe_formigari
 *essa é uma subclasse que estende da classe pai chamada ProdutosWEG
 */
public class InversorFrequencia extends ProdutoWEG{
	//criação dos atributos adicionas da classe
	private String capacidadeFrequencia;
	private int numeroFases;
	
	//método construtor para receber apenas as informações necessarias em algum caso em especifico
	public InversorFrequencia(int capacidade, String preco, int numeroFases) {
		setCapacidade(capacidade);
		setPreco(preco);
		setNumeroFases(numeroFases);
	}
	//método construtor vazio
	public InversorFrequencia() {
	}
	
	//getters e setters para validar as informações recebidas e para utilizar dessas informações futuramente
	public String getCapacidadeFrequência() {
		return capacidadeFrequencia;
	}
	public boolean setCapacidadeFrequência(String capacidadeFrequencia) {
		if (capacidadeFrequencia.length()<=3) {
			this.capacidadeFrequencia = capacidadeFrequencia;
			return true;
		}
		return false;
	}
	public int getNúmeroFases() {
		return numeroFases;
	}
	public boolean setNumeroFases(int numeroFases) {
		if(numeroFases >= 0) {
			this.numeroFases = numeroFases;
			return true;
		}
		return false;
	}
	//método toString para retornar as informações do Motor elétrico postas pelo usuario
	public String toString() {
		return "| capacidade frequência: " + this.capacidadeFrequencia + "| Número fases: " + this.numeroFases + "| codigo: " + 
				super.getCodigo() + "| potência: " + super.getPotencia() + "| tensão: " + super.getTensao() 
				+ "| capacidade: " + super.getCapacidade() + "| preço: " + super.getPreco() + " |";
	}		
}
