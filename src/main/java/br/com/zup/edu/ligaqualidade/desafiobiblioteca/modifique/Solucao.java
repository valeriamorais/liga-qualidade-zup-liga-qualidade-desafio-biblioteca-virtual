package br.com.zup.edu.ligaqualidade.desafiobiblioteca.modifique;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.zup.edu.ligaqualidade.desafiobiblioteca.DadosDevolucao;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.DadosEmprestimo;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.EmprestimoConcedido;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosExemplar;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosLivro;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosUsuario;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.TipoUsuario;
import org.junit.jupiter.api.Assertions;

public class Solucao {

	/**
	 * Você precisa implementar o código para executar o fluxo
	 * o completo de empréstimo e devoluções a partir dos dados
	 * que chegam como argumento. 
	 * 
	 * Caso você queira pode adicionar coisas nas classes que já existem,
	 * mas não pode alterar nada.
	 */
	
	/**
	 * 
	 * @param livros dados necessários dos livros
	 * @param exemplares tipos de exemplares para cada livro
	 * @param usuarios tipos de usuarios
	 * @param emprestimos informações de pedidos de empréstimos
	 * @param devolucoes informações de devoluções, caso exista. 
	 * @param dataParaSerConsideradaNaExpiracao aqui é a data que deve ser utilizada para verificar expiração
	 * @return
	 */
	public static Set<EmprestimoConcedido> executa(
			Set<DadosLivro> livros,
			Set<DadosExemplar> exemplares,
			Set<DadosUsuario> usuarios,
			Set<DadosEmprestimo> emprestimos,
			Set<DadosDevolucao> devolucoes,
			LocalDate dataParaSerConsideradaNaExpiracao) {

		boolean resultado = false;

		//criar funcao para pegar o tipo de usuario

		for (DadosEmprestimo emprestimo: emprestimos) {
			System.out.println("Analisando pedido do usuário PADRÃO - id: " + emprestimo.idUsuario);

			if (tipoUsuario == TipoUsuario.PADRAO){
				if (exemplares.size() < 6) {
					System.out.println("Quantidade de exemplares do pedido: ACEITO");
					System.out.println("Verificando prazos e exemplares permitidos no pedido do usuário");
					resultado = Permissao.getVerificaPedido(emprestimos, usuario);
				}
			}

			if (tipoUsuario == TipoUsuario.PESQUISADOR) {
				for(DadosEmprestimo emprestimo: emprestimos){

				}
			}
			if (resultado){

			}
		}

		
		return Set.of();
	}



}
