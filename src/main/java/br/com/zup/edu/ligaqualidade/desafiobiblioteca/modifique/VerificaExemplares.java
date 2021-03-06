package br.com.zup.edu.ligaqualidade.desafiobiblioteca.modifique;

import br.com.zup.edu.ligaqualidade.desafiobiblioteca.DadosEmprestimo;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosUsuario;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.TipoExemplar;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.TipoUsuario;

public class VerificaExemplares {
    public static Boolean getExemplar (DadosUsuario usuario, DadosEmprestimo emprestimo) {
        Boolean exemplarAceito = false;
        if(usuario.padrao == TipoUsuario.PADRAO){
            if (emprestimo.tipoExemplar == TipoExemplar.LIVRE){
                exemplarAceito = true;
            }
        }
        return exemplarAceito;
    }
}
