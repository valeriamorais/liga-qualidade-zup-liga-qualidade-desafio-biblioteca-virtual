package br.com.zup.edu.ligaqualidade.desafiobiblioteca.modifique;

import br.com.zup.edu.ligaqualidade.desafiobiblioteca.DadosEmprestimo;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosUsuario;
import java.util.Set;

public class Permissao {
    public static Boolean getVerificaPedido(Set<DadosEmprestimo> emprestimos, DadosUsuario usuario) {
        boolean exemplarAceito;
        boolean prazoAceito;
        boolean resultado = false;
        for(DadosEmprestimo emprestimo: emprestimos){
            prazoAceito = VerificaPrazo.getPrazo(usuario, emprestimo);
            exemplarAceito = VerificaExemplares.getExemplar(usuario, emprestimo);
            if (prazoAceito && exemplarAceito) resultado = true;
        }
        return resultado;
    }
}
