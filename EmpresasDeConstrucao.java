package trabalhopoo;
import java.util.List;
import java.util.ArrayList;

public class EmpresasDeConstrucao {
    private String razaoSocial;
    private int cnpj;
    private String endereco;
    private String telefone;
    private int inscEstadual;
    private List<EmpresasDeProjetos> empresasprojetistas;
    

    /**
     * 
     * @param razaoSocial razão social 
     * @param cnpj somente numeros do cnpj
     * @param endereco endereço completo 
     * @param telefone somente numeros do telefone com DDD
     * @param inscEstadual somente numeros da incrição estadual 
     */
    public EmpresasDeConstrucao(String razaoSocial, int cnpj, String endereco, String telefone, int inscEstadual) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.inscEstadual = inscEstadual;
        this.empresasprojetistas = new ArrayList<>();
    }

    /**
     * Método que adiciona uma empresa de projeto a lista de projetistas 
     * de uma empresa de construção 
     * @param projetistas recebe um objeto <tt>EmpresaDeProjetos</tt>
     */
    public void contrataProjetista(EmpresasDeProjetos projetistas){
        empresasprojetistas.add(projetistas);
    }
    
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

    public void setCnpj(int cnpj) {
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
