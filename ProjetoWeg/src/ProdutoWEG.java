/**
 * 
 * @author filipe_formigari
 *essa é a classe pai ou superclasse que vai servir para derivar para outras subclasses
 */
public class ProdutoWEG {
	//criação dos atributos da classe
	private int codigo;
	private String tipo;
	private int potencia;
	private int tensao;
	private int capacidade;
	private String preco;
	
	//método construtor para receber apenas as informações necessarias em algum caso em especifico
	public ProdutoWEG(int codigo, String tipo, int potencia, int tensao, int capacidade, String preco) {
		setCodigo(codigo);
		setTipo(tipo);
		setPotencia(potencia);
		setTensao(tensao);
		setCapacidade(capacidade);
		setPreco(preco);
	}
	//método construtor para receber apenas as informações necessarias em algum caso em especifico
	public ProdutoWEG(int codigo, String tipo, int potencia, int tensao) {
		setCodigo(codigo);
		setTipo(tipo);
		setPotencia(potencia);
		setTensao(tensao);
	}
	//método construtor vazio
	public ProdutoWEG() {
	}
	
	//getters e setters para validar as informações recebidas e para utilizar dessas informações
	public int getCodigo() {
		return codigo;
	}
	public boolean setCodigo(int codigo) {
		if (codigo >= 0 ) {
			this.codigo = codigo;
			return true;
		}
		return false;
		
	}
	public String getTipo() {
		return this.tipo;
	}
	public boolean setTipo(String tipo) {
		if (tipo.length()>= 3) {
			this.tipo = tipo;
			return true;
		}
		return false;
		
	}
	public int getPotencia() {
		return potencia;
	}
	public boolean setPotencia(int potencia) {
		if ( potencia >= 0) {
			this.potencia = potencia;
			return true;
		}
		return true;
	}
	public int getTensao() {
		return tensao;
	}
	public boolean setTensao(int tensão) {
		if ( tensao < 0 ) {
			return false;
		}
		else {
			this.tensao = tensão;
			return true;
		}
	}
	public int getCapacidade() {
		return capacidade;
	}
	public boolean setCapacidade(int capacidade) {
		if(capacidade >= 0) {
			this.capacidade = capacidade;
			return true;
		}
		return false;
	}
	public String getPreco() {
		return preco;
	}
	public boolean setPreco(String preco) {
		if( preco.matches(".*[a-zA-Z].*")) {
			return false;
		}
		else {
			this.preco = preco;
			return true;
		}
		
	}	
}