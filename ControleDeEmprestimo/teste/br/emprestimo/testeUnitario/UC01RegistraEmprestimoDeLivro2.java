package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.Test;

import br.emprestimo.modelo.Emprestimo;

public class UC01RegistraEmprestimoDeLivro2 {
	
	@Test
	public void CT01VerificarSeAdataDeEntregaEhDomingo(){
		//cenario
		String data = "20/05/2018";
		Emprestimo emprestimo = new Emprestimo();
		//acao
		boolean resultadoObtido = emprestimo.ehDomingo(data);
		//verificacao
		assertTrue(resultadoObtido);
		
	}

}
