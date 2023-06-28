package trabalhopoo;

import java.util.ArrayList;
import java.util.List;

public class Administrativos extends Funcionarios {
    /**
     * Atributos da classe
     */
    private int cfa_cra;
    ArrayList<NotasFiscais> listaNotasFiscais = new ArrayList<>();
    
    /**
     * Método construtor
     * @param cfa_cra Numero da identificação profissional 
     * @param nome nome completo 
     * @param cpf somente numeros do cpf
     * @param endereco endereço completo
     * @param telefone somente numeros do telefone com DDD
     * @param empresa empresa de projeto na qual está prestando serviço
     */
    public Administrativos(int cfa_cra, String nome, long cpf, String endereco, long telefone, EmpresasDeProjetos empresa) {
        // Chama o construtor da superclasse funcionarios 
        super(nome, cpf, endereco, telefone, empresa);
        
        // Adiciona documento de identificação especializado 
        this.cfa_cra = cfa_cra;
    }       
       
    
    // Métodos especializados de um Funcionário administrativo 
    
    /**
     * Segundo o diagrama de classes, somente funcionários administrativos 
     * podem emitir nota fiscal, esse método executa esse procedimento 
     * utilizando os dados de um objeto nota fiscal através do métodos 
     * <tt>setEmissor</tt> e <tt>add</tt>
     * @param notafiscal objeto do <tt>tipo NotasFiscais</tt>
     */
    public void gerarNotafiscal(NotasFiscais notafiscal) {
        notafiscal.setEmissor(this);
        listaNotasFiscais.add(notafiscal);
    }
    
    /**
     * Procura nota fiscal já adicionada através de um loop que percorre 
     * toda <tt>listaNotasFiscais</tt> e guarda o resultado em uma variável
     * caso o valor dela não seja null ela mostra na tela o resultado caso 
     * contrário exibe mensagem que a nota fiscal não foi encontrada 
     * @param chaveAcessoDesejada numero da chave de acesso
     */
    public void procurarNotaFiscalPorChaveAcesso(String chaveAcessoDesejada) {
        NotasFiscais notaFiscalEncontrada = null;
        for (NotasFiscais notaFiscal : listaNotasFiscais) {
            if (notaFiscal.getChaveAcessso().equals(chaveAcessoDesejada)) {
                notaFiscalEncontrada = notaFiscal;
                break;
            }
        }

        if (notaFiscalEncontrada != null) {
            InOut.MsgDeInformacao("Sistema administrativo", "Nota fiscal encontrada: " + notaFiscalEncontrada);
        } else {
            InOut.MsgDeInformacao("Sistema administrativo", "Nota fiscal com chave de acesso " + chaveAcessoDesejada + " não encontrada.");
        }
    }
   
    // Métodos getters e setters 
    public int getCfa_cra() {
        return cfa_cra;
    }

    public void setCfa_cra(int cfa_cra) {
        this.cfa_cra = cfa_cra;
    }    
}
