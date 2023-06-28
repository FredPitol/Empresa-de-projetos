package trabalhopoo;
 
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Projetos {
    /**
     * Atributos da classe
     */
    private int cod;
    private String nome;
    private String data;
    private float valorPrevisto;
    private Departamento tipoProjeto;
    private EmpresasDeProjetos responsavel;
    private NotasFiscais notafiscal;
    
    List<Engenheiros> listaEngenheiros = new ArrayList<>();
    List<Tecnicos> listaTecnicos = new ArrayList<>();
    
   // Métodos da classe 
    
    /**
     * Adiciona uma nota fiscal ao atributo notafiscal
     * @param notaFiscal objeto nota fiscal 
     */
    public void adicionarNotaFiscal(NotasFiscais notaFiscal) { //DUVIDA
        this.setNotafiscal(notaFiscal);
    }
    
    /**
     * Adiciona um engenheiro a listaEngenheiros
     * @param engenheiro objeto do Engenheiros
     */
    public void adicionarEngenheiro(Engenheiros engenheiro){
        listaEngenheiros.add(engenheiro);
    }
    
    /**
     * Adiciona um técnico a listaTecnicos
     * @param tecnico objeto do tipo Tecnicos
     */
    public void adicionarTecnico(Tecnicos tecnico){
        tecnico.participaProjeto(this);
        listaTecnicos.add(tecnico);
    }   
    
    /**
     * Método construtor
     * @param cod código do projeto 
     * @param nome nome do técnico
     * @param data data de inicio
     * @param valorPrevisto valor estipulado do projeto 
     * @param tipoProjeto objeto do tipo Departamento 
     */
    public Projetos(int cod, String nome, String data, float valorPrevisto, Departamento tipoProjeto) {
        this.cod = cod;
        this.nome = nome;
        this.data = data;
        this.valorPrevisto = valorPrevisto;
        this.tipoProjeto = tipoProjeto;

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValorPrevisto() {
        return valorPrevisto;
    }

    public void setValorPrevisto(float valorPrevisto) {
        this.valorPrevisto = valorPrevisto;
    }


    public String getTipoProjeto() {
        return tipoProjeto.getNome();
    }

    public void setTipoProjeto(Departamento tipoProjeto) {
        this.tipoProjeto = tipoProjeto;
    }
    
    public String getEngenheiros() { 
        
        int tamanho = listaEngenheiros.size();
        int index = 0;
        List<String> engenheiros = new ArrayList<>();
        
        while(index < tamanho){
            Engenheiros engenheiro = this.listaEngenheiros.get(index);
            engenheiros.add(engenheiro.getNome());
            
            index += 1;
        }
        
        String todos = Arrays.toString(engenheiros.toArray());
        
                            
        return todos;   
    }
        
    public void setListaEngenheiros(List<Engenheiros> listaEngenheiros) {
        this.listaEngenheiros = listaEngenheiros;
    }

    public String getTecnicos() { 
        int tamanho = listaTecnicos.size();
        int index = 0;
        List<String> tecnicos = new ArrayList<>();
        
        while(index < tamanho){
            Tecnicos todostecnicos = this.listaTecnicos.get(index);
            tecnicos.add(todostecnicos.getNome());
            
            index += 1;
        }
        
        String todos = Arrays.toString(tecnicos.toArray());
        
                            
        return todos;
    }

    public void setListaTecnicos(List<Tecnicos> listaTecnicos) {
        this.listaTecnicos = listaTecnicos;
    }

    public EmpresasDeProjetos getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(EmpresasDeProjetos responsavel) {
        this.responsavel = responsavel;
    }

    public NotasFiscais getNotafiscal() {
        return notafiscal;
    }

    public void setNotafiscal(NotasFiscais notafiscal) {
        this.notafiscal = notafiscal;
    }    
}   
