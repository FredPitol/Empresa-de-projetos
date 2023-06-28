package trabalhopoo;

public class Tecnicos extends Funcionarios{
    private String formacao;
    private Projetos projeto;
    
    // Metodo construtor
    public Tecnicos(String formacao, String nome, long cpf, String endereco, long telefone, EmpresasDeProjetos empresa) {
        super(nome, cpf, endereco, telefone, empresa);
        this.formacao = formacao;
    }
     
    /**
     * Adiciona um técnico a um projeto
     * @param projeto objeto do tipo projetos 
     */
    public void participaProjeto(Projetos projeto){
        this.setProjeto(projeto);
    }

    // Métodos getters e setters
    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Projetos getProjeto() {
        return projeto;
    }

    public void setProjeto(Projetos projeto) {
        this.projeto = projeto;
    }
}
