package cadastrobd.model;

public class PessoaJuridica extends Pessoa {
    
    private String CNPJ;
    
    public PessoaJuridica(){
    }
    
    public PessoaJuridica(int id, String nome, String logradouro, String cidade, 
           String estado, String telefone, String email, String cnpj){
        super(id, nome, logradouro, cidade, estado, telefone, email);
        this.CNPJ = CNPJ;
    }

    public String getCnpj() {
        return CNPJ;
    }

    public void setCnpj(String cnpj) {
        this.CNPJ= CNPJ;
    }
    
    @Override
    public String exibir(){
        return super.exibir()+ "\nCNPJ: " + CNPJ;
    }
            
}