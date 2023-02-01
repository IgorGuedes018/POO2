package br.ufjf.poo.model;

public class Automovel extends Veiculo{

	@Override
	public double calculaConsumo(double precoLitro) {
		return (this.getCapacidadeTanque() / this.getKmPorLitro()) * precoLitro;
	}

}
