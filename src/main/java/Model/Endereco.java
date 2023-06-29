package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Endereco")
    private int id_endereco;
    
    @Column(name = "Rua")
    private String rua;
    
    @Column(name = "Bairro")
    private String bairro;
    
    @Column(name = "Municipio")
    private String municipio;
    
    @Column(name = "Estado")
    private String estado;
    
    @Column(name = "Numero")
    private int numero;
    
    @Column(name = "CEP")
    private String cep;

    public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" + "id_endereco=" + id_endereco + ", rua=" + rua + ", bairro=" + bairro + ", municicio=" + municipio + ", estado=" + estado + ", numero=" + numero + ", cep=" + cep + '}';
    }

    
    
}
