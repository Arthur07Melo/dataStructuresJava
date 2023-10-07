package atividade03.tests;

import org.junit.Before;
import org.junit.Test;

import atividade03.Pilha_IF;

import static org.junit.Assert.assertTrue;


public class Test0_Pilha {

	private static Pilha_IF pilha;
	
	@Before //Instanciando a Pilha antes de cada teste
	public void instanciaPilha() throws Exception{
		pilha = new PilhaComLista();
	}
	
	
}