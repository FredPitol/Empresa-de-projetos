
package trabalhopoo;

public class TrabalhoPoo {

    
    public static void main(String[] args) {
    
    /**    
    * Instância de classes necessárias para funcionamento do sistema com 
    * seus respectivos dados como parâmetro
    */
    
    /**
     * Intancia de uma empresa de construcao CONSTRUTORA
     */
    
    EmpresasDeConstrucao construtora = new EmpresasDeConstrucao("Construtora Brasil", 123,"VilaVelha - ES", "999123456", 0001);
    
    
    /**
     * Instancia de uma empresa de projetos 
     * Chama metodos setters para popular dados 
     */
    EmpresasDeProjetos projetista = new EmpresasDeProjetos();
    projetista.setRazaoSocial("S&A projetos");
    projetista.setCnpj(456);
    projetista.setEndereco("VilaVelha -ES");
    projetista.setTelefone("999876543");
    projetista.setInscEstadual(0002);
    
    
    
    /**
     * Instancia de 3 engenheiros
     * Chama método adicionarFuncionário do objeto empresaDeProjetos projetista
     * com dados do funcionário como parâmetro
     */
    
    Engenheiros engenheiro1 = new Engenheiros(3210,"josé", 001, "Vitória - Es", 99900000, projetista); 
    projetista.adicionarFuncionario(engenheiro1);
    Engenheiros engenheiro2 = new Engenheiros(3211,"Caio", 002, "Vitória - Es", 99900001,projetista);
    projetista.adicionarFuncionario(engenheiro2);
    Engenheiros engenheiro3 = new Engenheiros(3212,"Henrique", 003, "Vitória - Es", 99900002, projetista);
    projetista.adicionarFuncionario(engenheiro3);
    
    /**
     * Instância 3 Tecnicos
     * Chama método adicionarFuncionário do objeto empresaDeProjetos projetista
     * com dados do funcionário como parâmetro
     */
    
    Tecnicos tecnico1 = new Tecnicos("Mecanico", "Pedro", 004, "Viana - Es", 99900003,projetista);
    projetista.adicionarFuncionario(tecnico1);
    Tecnicos tecnico2 = new Tecnicos("Eltrecista", "Matheus", 005, "Serra - Es", 99900004, projetista);
    projetista.adicionarFuncionario(tecnico2);
    Tecnicos tecnico3 = new Tecnicos("Encanador", "Rafael", 006, "VilaVelha - Es", 99900005, projetista);
    projetista.adicionarFuncionario(tecnico3);
    
    /**
     * Instância 3 funcionários administrativos
     * Chama método adicionarFuncionário do objeto empresaDeProjetos projetista
     * com dados do funcionário como parâmetro
     */
    
    Administrativos administrativo1 = new Administrativos(444, "Felipe", 007, "Cariacica - Es",99900006, projetista);
    projetista.adicionarFuncionario(administrativo1);
    Administrativos administrativo2 = new Administrativos(555, "Rian", 011, "Serra - Es",99900007, projetista);
    projetista.adicionarFuncionario(administrativo2);
    Administrativos administrativo3 = new Administrativos(666, "Nathan", 012, "Serra - Es",99900008, projetista);
    projetista.adicionarFuncionario(administrativo3);
    
    /**
     * Instância 3 departamentos com dados do departamento como parâmetro
     */
    Departamento eletrico = new Departamento( 1, "Elétrico");
    
     // Chama método gerenciaDep do objeto Engenheiros engenheiro1 adicionando
    engenheiro1.gerenciaDep(eletrico);
    
    // Adiciona objeto departamento a lista de departamentos do objeto projetista
    projetista.adicionarDepartamento(eletrico);
    
    //Cria um novo departamento adicionando o objeto engenheiro2 como seu gerente
    Departamento hidraulico = new Departamento(2, "Hidraulico");
    engenheiro2.gerenciaDep(hidraulico);
    
    
    /**
     * Adiciona um novo departamento pelo objeto projetistas
     * esse departamento não tem gerente, 
     * usamos essa instância para exemplificara parte do briefing que menciona 
     * que um departamento pode ter 0 ou 1 gerentes
     */
    projetista.adicionarDepartamento(hidraulico);
    
    /**
     * Estância de novo departamento seguida do método para adicioná-lo a lista
     * de departamentos do objeto projetista 
     */
    Departamento mecanico = new Departamento( 3, "Mecânico");
    projetista.adicionarDepartamento(mecanico);
    
    
   /**
    * Adiciona objeto projetistas a lista de empresas projetistas do objeto 
    *  Construtora 
    */
    construtora.contrataProjetista(projetista);
    
    /**
     * Inicio do menu de opções que mostra na barra superior da janela a razão 
     * social da empresa e no texto dentro da caixa uma mensagem de boas vindas
     * conceito 
     */  
    InOut.MsgSemIcone("Sistema da " + projetista.getRazaoSocial() , "Bem vindo ao sistema!");
    
    /**
     * Laço para 
     */
        OUTER:
        while (true) {
            int options = InOut.leInt("MENU:\n1. Emitir nota fiscal\n2. Buscar nota fiscal\n3. Sair");
            switch (options) {
                case 1 -> {
                    // Condicional que recebe opção do usuário
                    int escolha = InOut.leInt("Escolha o tipo do seu projeto:\n Digite 1 para: Projeto eletrico\n Digite 2 para: Projeto hidraulico\n Digite 3 para: Projeto mecanico");
                // Escolha 1 (Projeto elétrico)
                switch (escolha) {
                    case 1 ->                         {
                            //Instância de novo projeto elétrico
                            Projetos projeto1 = new Projetos(001, "Projeto Eletrico", "ff", 10.000f, eletrico);
                            projetista.adicionarProjeto(projeto1);
                            projeto1.adicionarTecnico(tecnico1);
                            projeto1.adicionarEngenheiro(engenheiro1);
                            String numeroNotaFiscal = InOut.leString("Digite o código da nota" );
                            String data =  InOut.leString("Digite a data de emissão" );
                            NotasFiscais notaFiscal1 = new NotasFiscais(numeroNotaFiscal, construtora, projetista, data, projeto1);
                            administrativo1.gerarNotafiscal(notaFiscal1);
                            notaFiscal1.emiteNota();
                            projeto1.adicionarNotaFiscal(notaFiscal1);
                        }
                    case 2 ->                         {
                            Projetos projeto1 = new Projetos(001, "Projeto Hidraulico", "ff", 15.000f, hidraulico);
                            projetista.adicionarProjeto(projeto1);
                            projeto1.adicionarTecnico(tecnico2);
                            projeto1.adicionarEngenheiro(engenheiro2);
                            String numeroNotaFiscal = InOut.leString("Digite o código da nota" );
                            String data =  InOut.leString("Digite a data de emissão" );
                            NotasFiscais notaFiscal1 = new NotasFiscais(numeroNotaFiscal, construtora, projetista, data, projeto1);
                            administrativo1.gerarNotafiscal(notaFiscal1);
                            notaFiscal1.emiteNota();
                            projeto1.adicionarNotaFiscal(notaFiscal1);
                        }
                    case 3 ->                         {
                            Projetos projeto1 = new Projetos(001, "Projeto Mecânico", "ff", 20.000f, mecanico);
                            projetista.adicionarProjeto(projeto1);
                            projeto1.adicionarTecnico(tecnico3);
                            projeto1.adicionarEngenheiro(engenheiro3);
                            String numeroNotaFiscal = InOut.leString("Digite o código da nota" );
                            String data =  InOut.leString("Digite a data de emissão" );
                            NotasFiscais notaFiscal1 = new NotasFiscais(numeroNotaFiscal, construtora, projetista, data, projeto1);
                            administrativo1.gerarNotafiscal(notaFiscal1);
                            notaFiscal1.emiteNota();
                            projeto1.adicionarNotaFiscal(notaFiscal1);
                        }
                    default -> {
                    }
                }
            }
                case 2 -> {
                    String codigoNota = InOut.leString("Digite o codigo da nota: ");
                    administrativo1.procurarNotaFiscalPorChaveAcesso(codigoNota);
            }
                case 3 -> {
                    InOut.MsgDeAviso("Sistema administrativo " , "Sistema encerrado");
                    break OUTER;
            }
                default -> {
            }
            }
        }
}  
} 
    

