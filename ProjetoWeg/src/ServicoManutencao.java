/**
 * 
 * @author filipe_formigari
 *essa é uma classe para ter um controle maior dos serviços de manutenção
 */
public class ServicoManutencao {
	 //criação dos atributos da classe
	 private String descricao ;
	 private double custo;
	 private int opcao;
	 
	//método construtor para receber apenas as informações necessarias em algum caso em especifico
	 public ServicoManutencao(String descricao, double custo) {
			setDescricao(descricao);
			setCusto(custo);
	}
	//método construtor vazio	
	public ServicoManutencao() {
			
	}
	
	//getters e setters para validar as informações recebidas e para utilizar dessas informações futuramente
	public String getDescricao() {
		return descricao;
	}
	public boolean setDescricao(String descricao) {
		if ( descricao.length()>3) {
			this.descricao = descricao;
			return true;
		}
	return false;
	}
	public double getCusto() {
		return custo;
	}
	public boolean setCusto(double custo) {
		if (custo > 0.0) {
			this.custo = custo;
			return true;
		}
		return false;
	}
	public int getOpcao() {
		return opcao;
	}
	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	//método toString para retornar as informações dos serviços de manutenção postas pelo usuario
	public String toString() {
		return "| descrição: " + this.descricao + "| custo: " + this.custo + "| produto: ( 1 - Motor Elétrico  2 - Gerador  3 - Inversor de frequência): " + this.opcao + " |";
	}
}