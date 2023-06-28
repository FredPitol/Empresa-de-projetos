package trabalhopoo;

import java.util.List;
import java.util.ArrayList;

public class EmpresasDeProjetos {
    private String razaoSocial;
    private long cnpj;
    private String endereco;
    private String telefone;
    private int inscEstadual;
    
    // Arrays que armazenam objetos departamentos, funcionários e projetos 
    List<Departamento> listaDepartamentos = new ArrayList<>();
    List<Funcionarios> listaFuncionarios = new ArrayList<>();
    List<Projetos> listaProjetos = new ArrayList<>();

    /**
     * Adiciona um novo departamento a listaDepartamentos 
     * da classe empresaDeProjetos
     * @param departamento objeto departamento 
     */
    public void adicionarDepartamento(Departamento departamento){
        listaDepartamentos.add(departamento);
    }
    
     /**
     * Adiciona um novo funcionário a a lista 
     * @param funcionario objeto funcionário 
     */
    public void adicionarFuncionario(Funcionarios funcionario){
        listaFuncionarios.add(funcionario);
    }
    
    /**
     * Adiciona objeto a lista de projetos da classe <tt>EmpresaDeProjetos</tt>
     * @param p objeto do tipo projeto 
     */
    public void adicionarProjeto(Projetos p){
        listaProjetos.add(p);
    }

    // Método construtor
    public EmpresasDeProjetos() {}
     
    // Métodos getters e setters 
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(int inscEstadual) {
        this.inscEstadual = inscEstadual;
    }   
}