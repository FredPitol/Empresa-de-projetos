package trabalhopoo;

// Superclasse que tem como subclasses Técnicos, Administrativos, Engenheiros 
public class Funcionarios {
    private String nome;
    private long cpf;
    private String endereco;
    private long telefone;
    private EmpresasDeProjetos empresa;
    
    
    // Método construtor 
    public Funcionarios(String nome, long cpf, String endereco, long telefone, EmpresasDeProjetos empresa) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.empresa = empresa;
    }
    
    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    
    
    
    
    
    
    
    
}
