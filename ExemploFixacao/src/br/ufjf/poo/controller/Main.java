package br.ufjf.poo.controller;

import br.ufjf.poo.model.*;

public class Main {

	
	
	public static void main(String[] args) {
		Automovel a1 = new Automovel();
		a1.setMarca("bmw");
		a1.setCapacidadeTanque(55);
		a1.setKmPorLitro(15);
		
		System.out.println("valor:" + a1.calculaConsumo(5));
		
		
		
		
	}

}
