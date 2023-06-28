package trabalhopoo;

public class NotasFiscais {
    private String chaveAcessso;
    private EmpresasDeConstrucao cnpjEmpCons;
    private EmpresasDeProjetos cnpjEmpProj;
    private String dataEmissao;
    private Projetos projeto;
    private Administrativos emissor;

    /**
     * Método construtor
     * @param chaveAcessso Chave de acesso da NF
     * @param cnpjEmpCons CNPJ da empresa de construção
     * @param cnpjEmpProj CNPJ da empresa de projetos
     * @param dataEmissao Data de emissão da NF
     * @param projeto Objeto do tipo Projeto que essa NF corresponde
     */
    public NotasFiscais(String chaveAcessso, EmpresasDeConstrucao cnpjEmpCons, EmpresasDeProjetos cnpjEmpProj, String dataEmissao, Projetos projeto) {
        this.chaveAcessso = chaveAcessso;
        this.cnpjEmpCons = cnpjEmpCons;
        this.cnpjEmpProj = cnpjEmpProj;
        this.dataEmissao = dataEmissao;
        this.projeto = projeto;
    }      

    // Método que exibe na tela informações contidas na NF
    public void emiteNota(){
        InOut.MsgDeInformacao("Nota Fiscal", 
                              "Chave de acesso: " + this.getChaveAcessso() 
                            + "\nData de Emissão: " + this.getDataEmissao()
                            + "\nCNPJ Contratante: " + this.cnpjEmpCons.getCnpj()
                            + "\nCNPJ Projetista: " +this.cnpjEmpProj.getCnpj()
                            + "\nEmissor: " + this.getEmissor().getNome()
                            + "\n------Projeto------"
                            + "\nCod projeto: " + this.projeto.getCod()
                            + "\nTipo projeto: " + this.projeto.getTipoProjeto()
                            + "\nNome projeto: " + this.projeto.getNome()
                            + "\nValor previsto: " + this.projeto.getValorPrevisto()
                            + "\nEngenheiros: " + this.projeto.getEngenheiros()
                            + "\nTecnicos: "+ this.projeto.getTecnicos()
                            );
   
    }
    
        
    // Métodos getters e setters 
    public String getChaveAcessso() {
        return chaveAcessso;
    }

    public void setChaveAcessso(String chaveAcessso) {
        this.chaveAcessso = chaveAcessso;
    }

    public long getCnpjEmpCons() {
        return cnpjEmpCons.getCnpj();
    }

    public void setCnpjEmpCons(EmpresasDeConstrucao cnpjEmpCons) {
        this.cnpjEmpCons = cnpjEmpCons;
    }

    public long getCnpjEmpProj() {
        return cnpjEmpProj.getCnpj();
    }

    public void setCnpjEmpProj(EmpresasDeProjetos cnpjEmpProj) {
        this.cnpjEmpProj = cnpjEmpProj;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getProjeto() {
        return projeto.getNome();
    }
    public float getValorProjeto() {
        return projeto.getValorPrevisto();
    }

    public void setProjeto(Projetos projeto) {
        this.projeto = projeto;
    }

    public Administrativos getEmissor() {
        return emissor;
    }

    public void setEmissor(Administrativos emissor) {
        this.emissor = emissor;
    }
    
    
    @Override
    public String toString() {
        return "\nNotaFiscal:\nChaveAcesso: " + this.getChaveAcessso() + "\nprojeto: " + this.projeto.getNome() + "\nvalor: " + this.getValorProjeto();
    }

    
     
}
