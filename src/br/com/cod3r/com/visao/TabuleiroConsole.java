package br.com.cod3r.com.visao;

import java.util.Scanner;

import br.com.cod3r.com.excecao.ExplosaoException;
import br.com.cod3r.com.excecao.SairException;
import br.com.cod3r.com.modelo.Tabuleiro;

public class TabuleiroConsole {
	
	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);
	
	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
		executarJogo();
	}

	private void executarJogo() {
		try {
			boolean continuar = true;
			cicloDoJogo();			
			
			while(continuar) {
				System.out.println("Outra partida? (S/n)");
				String resposta = entrada.nextLine();
				
				if("n".equalsIgnoreCase(resposta)){
					continuar = false;
				}else {
					tabuleiro.reiniciar();
				}
			}
		} catch (SairException e) {
			System.out.println("Tchau!!!");
		}finally {
			entrada.close();
		}
	}

	private void cicloDoJogo() {
		try {
			System.out.println("Voce ganhou!!!!");
		} catch (ExplosaoException e) {
			System.out.println("Voce perdeu!");
		}
		
	}

}
