package cadastrobd.model;

public class PessoaFisica extends Pessoa {
    
    private String CPF;
    
    public PessoaFisica(){  
    }
    
    public PessoaFisica(int id, String nome, String logradouro, String cidade, 
           String estado, String telefone, String email, String cpf){
        super(id, nome, logradouro, cidade, estado, telefone, email);
        this.CPF= CPF;
    }

    public String getCpf() {
        return CPF;
    }

    public void setCpf(String cpf) {
        this.CPF = cpf;
    }
    
    @Override
    public String exibir(){
        return super.exibir()+ "\nCPF: " + getCpf();
    }
}