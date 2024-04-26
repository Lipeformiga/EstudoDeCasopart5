/**
 * 
 * @author filipe_formigari
 *essa é uma subclasse que estende da classe pai chamada ProdutosWEG
 */
public class MotorEletrico extends ProdutoWEG{
     //criação dos atributos adicionas da classe
	 private String tipoEnrolamento;
	 private double eficiencia;
	 
	//método construtor para receber apenas as informações necessarias em algum caso em especifico
	 public MotorEletrico(double eficiencia, int codigo) {
		 setEficiência(eficiencia);
		 setCodigo(codigo);
	 }
	//método construtor vazio
	 public MotorEletrico() {
	 }
	
	//getters e setters para validar as informações recebidas e para utilizar dessas informações futuramente
	public String getTipoEnrolamento() {
		return tipoEnrolamento;
	}
	public boolean setTipoEnrolamento(String tipoEnrolamento) {
		if( tipoEnrolamento.length()>=3) {
			this.tipoEnrolamento = tipoEnrolamento;
			return true;
		}
		return false;
	}
	public double getEficiencia() {
		return eficiencia;
	}
	public boolean setEficiência(double eficiencia) {
		if ( eficiencia>= 0) {
			this.eficiencia = eficiencia;
			return true;
		}
		return false;
	}
	//método toString para retornar as informações dos motores elétricos postas pelo usuario
	public String toString() {
		return "| tipo enrolamento: " + this.tipoEnrolamento + "| eficiência: " + this.eficiencia + "| codigo: " + 
				super.getCodigo() + "| potência: " + super.getPotencia() + "| tensão: " + super.getTensao() 
				+ "| capacidade: " + super.getCapacidade() + "| preço: " + super.getPreco() + " |";
	}	
}