package Model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Secretario")
public class Secretario{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Secretario")
    private int id_secretario;
    
    @OneToOne
    @JoinColumn(name = "Id_Cadastro")
    private Cadastro id_cadastro;

    public int getId_secretario() {
        return id_secretario;
    }

    public void setId_secretario(int id_secretario) {
        this.id_secretario = id_secretario;
    }

    public Cadastro getId_cadastro() {
        return id_cadastro;
    }

    public void setId_cadastro(Cadastro id_cadastro) {
        this.id_cadastro = id_cadastro;
    }

    @Override
    public String toString() {
        return "Secretario{" + "id_secretario=" + id_secretario + ", id_cadastro=" + id_cadastro + '}';
    }

    
    
}
