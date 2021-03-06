package br.com.zup.edu.ligaqualidade.desafiobiblioteca.modifique;

import br.com.zup.edu.ligaqualidade.desafiobiblioteca.DadosEmprestimo;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosUsuario;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.TipoUsuario;

public class VerificaPrazo {
    public static Boolean getPrazo (DadosUsuario usuario, DadosEmprestimo emprestimo) {
        Boolean prazoAceito = false;
        if(usuario.padrao == TipoUsuario.PADRAO){
            if (emprestimo.tempo != 0 && emprestimo.tempo <= 60){
                prazoAceito = true;
            }
        }
        return prazoAceito;
    }
}
