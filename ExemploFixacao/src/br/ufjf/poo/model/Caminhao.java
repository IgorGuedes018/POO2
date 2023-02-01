package br.ufjf.poo.model;

public class Caminhao extends Veiculo{
	private double tara;
	
	
	@Override
	public double calculaConsumo(double precoLitro) {
		return ( (this.getCapacidadeTanque() / this.getKmPorLitro() ) * precoLitro) ;
		//(capacidadeTanque/KmPorLitro) * (precoLitro/tara)
	}
	
	
		
	public double getTara() {
		return tara;
	}
	public void setTara(double tara) {
		this.tara = tara;
	}
}
