package main;

import model.Cachorro;
import model.Cavalo;
import model.Preguica;
import model.Veterinario;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		Veterinario veterinario = new Veterinario();
		
		cachorro.emitirSom();
		cachorro.correr();
		cavalo.emitirSom();
		cavalo.correr();
		preguica.emitirSom();
		preguica.subirArvore();
		veterinario.examinar();

	}

}
