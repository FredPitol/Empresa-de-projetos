package trabalhopoo;


public class Departamento {
    
    private int cod;
    private String nome;
    private EmpresasDeProjetos empresa;
    private Engenheiros gerente;
                       
    
    /**
     * Metodo construtor
     * @param cod Código do departamento
     * @param nome Nome do departamento 
     */
    public Departamento(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;

    }

    // Métodos getters e setters
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Engenheiros getGerente() {
        return gerente;
    }
    
    /**
     * Somente engenheiros podem ser gerentes
     * Esse método recebe qual departamento esse engenheiro é gerente 
     * @param gerente objeto engenheiro que será gerente do departamento
     */
    public void setGerente(Engenheiros gerente) {
        this.gerente = gerente;
    }
    
    
    
    
}
