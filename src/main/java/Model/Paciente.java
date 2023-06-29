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
@Table(name = "paciente")
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Paciente")
    private int id_paciente;
    
    @OneToOne
    @JoinColumn(name = "Id_Cadastro")
    private Cadastro id_cadastro;
    
    @Column(name = "Plano_De_Saude")
    private String plano_saude;
    
    @Column(name = "Alergias")
    private String alergias;

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Cadastro getId_cadastro() {
        return id_cadastro;
    }

    public void setId_cadastro(Cadastro id_cadastro) {
        this.id_cadastro = id_cadastro;
    }

    public String getPlano_saude() {
        return plano_saude;
    }

    public void setPlano_saude(String plano_saude) {
        this.plano_saude = plano_saude;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id_paciente=" + id_paciente + ", id_cadastro=" + id_cadastro + ", plano_saude=" + plano_saude + ", alergias=" + alergias + '}';
    }
    
    
    
}
