package br.DevBros.Noobies.Clientes;
import java.sql.Date;

public class Cliente {
    
    private int codCliente;
    private String cpf;
    private String nome;
    private String email;
    private String telefone;
    

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    public Cliente(String cpf, String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;       
    }
    public Cliente(){
        
    }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public int getcodCliente() {
        return codCliente;
    }

    public void setcodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
    
    
}
