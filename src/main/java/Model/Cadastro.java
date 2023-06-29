package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cadastro")
public class Cadastro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Cadastro")
    private int id_cadastro;
    
    @Column(name = "Tipo_de_Cadastro")
    private String tipo_cadastro;
    
    @Column(name = "CPF")
    private String cpf;
    
    @Column(name = "Nome")
    private String nome;
    
    @Column(name = "Nascimento")
    private String nascimento;
    
    @Column(name = "Email")
    private String email;
    
    @Column(name = "Telefone")
    private String telefone;
    
    @Column(name = "Genero")
    private String genero;
    
    @OneToOne
    @JoinColumn(name = "Id_endereco")
    private Endereco id_endereco;

    public int getId_cadastro() {
        return id_cadastro;
    }

    public void setId_cadastro(int id_cadastro) {
        this.id_cadastro = id_cadastro;
    }

    public String getTipo_cadastro() {
        return tipo_cadastro;
    }

    public void setTipo_cadastro(String tipo_cadastro) {
        this.tipo_cadastro = tipo_cadastro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
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

    public Endereco getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Endereco id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cadastro{" + "id_cadastro=" + id_cadastro + ", tipo_cadastro=" + tipo_cadastro + ", cpf=" + cpf + ", nome=" + nome + ", nascimento=" + nascimento + ", email=" + email + ", telefone=" + telefone + ", genero=" + genero + ", id_endereco=" + id_endereco + '}';
    }

    
    
}
