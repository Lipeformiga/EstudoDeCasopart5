/**
 * 
 * @author filipe_formigari
 *essa é uma subclasse que estende da classe pai chamada ProdutosWEG
 */
public class Gerador extends ProdutoWEG{
	//criação dos atributos adicionas da classe
	private int tipoCombustivel;
	private double autonomia;
	
	//método construtor para receber apenas as informações necessarias em algum caso em especifico
	public Gerador(int codigo, String tipo) {
		setCodigo(codigo);
		setTipo(tipo);
	}
	//método construtor vazio
	public Gerador() {
		
	}
	//getters e setters para validar as informações recebidas e para utilizar dessas informações futuramente
	public int getTipoCombustivel() {
		return tipoCombustivel;
	}
	public boolean setTipoCombustível(int tipoCombustivel) {
		if(tipoCombustivel == 3 || tipoCombustivel == 2 || tipoCombustivel == 1) {
			this.tipoCombustivel = tipoCombustivel;
			return true;
		}
		return false;
	}
	public double getAutonomia() {
		return autonomia;
	}
	public boolean setAutonomia(double autonomia) {
		if(autonomia >= 0) {
			this.autonomia = autonomia;
			return true;
		}
		return false;
	}
	//método toString para retornar as informações dos geradores postas pelo usuario
	public String toString() {
		return "| tipoCombustivel: " + this.tipoCombustivel + "| autonomia: " + this.autonomia + "|codigo: " + 
				super.getCodigo() + "| potência: " + super.getPotencia() + "| tensão: " + super.getTensao() 
				+ "| capacidade: " + super.getCapacidade() + "| preço: " + super.getPreco() + " |";
	}
}