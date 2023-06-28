package trabalhopoo;

import java.util.ArrayList;
import java.util.List;

public class Engenheiros extends Funcionarios{
    private int crea;
    private Departamento departamento;
    List<Projetos> listaProjetos = new ArrayList<>();

  
    /**
     * Método construtor
     * @param crea numero de identificação do crea 
     * @param nome nome completo 
     * @param cpf numero de cpf 
     * @param endereco endereço completo 
     * @param telefone telefone com ddd
     * @param empresa empresa de projetos na qual o engenheiro foi contratado 
     */
    public Engenheiros(int crea, String nome, long cpf, String endereco, long telefone, EmpresasDeProjetos empresa) {
        super(nome, cpf, endereco, telefone, empresa);
        this.crea = crea;
    }
        
    /**
     * Adiciona projeto a listaProjetos que um engenheiro participa ou 
     * já participou
     * @param projeto objeto do tipo Projetos
     */
    public void participaProjeto(Projetos projeto){
        this.listaProjetos.add(projeto);
    }
    
    /**
     * Recebe objeto departamento que está sendo processado e adiciona esse 
     * objeto engenheiro como gerente dele 
     * @param departamento objeto departamento
     */
    public void gerenciaDep(Departamento departamento){
        this.setDepartamento(departamento);
        this.getDepartamento().setGerente(this);
    }

   /**
    * Métodos getters e setters
    */
    public int getCrea() {
        return crea;
    }

    public void setCrea(int crea) {
        this.crea = crea;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    
    
    
    
}
