package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "medico")
public class Medico{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Medico")
    private int id_medico;
    
    @OneToOne
    @JoinColumn(name = "Id_Cadastro")
    private Cadastro id_cadastro;
    
    @JoinColumn(name = "Especialidade")
    private String especialidade;
    
    @Column(name = "CRM")
    private int crm;

    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public Cadastro getId_cadastro() {
        return id_cadastro;
    }

    public void setId_cadastro(Cadastro id_cadastro) {
        this.id_cadastro = id_cadastro;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico{" + "id_medico=" + id_medico + ", id_cadastro=" + id_cadastro + ", especialidade=" + especialidade + ", crm=" + crm + '}';
    }
    
    
    
    
}
