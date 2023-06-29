package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consulta")
public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Consulta")
    private int id_consulta;
    
    @ManyToOne
    @JoinColumn(name = "Id_Medico")
    private Medico id_medico;
    
    @ManyToOne
    @JoinColumn(name = "Id_Paciente")
    private Paciente id_paciente;
    
    @ManyToOne
    @JoinColumn(name = "Id_Secretario")
    private Secretario id_secretario;
    
    @Column(name = "Data")
    private String data;
    
    @Column(name = "Hora")
    private String hora;
    
    @Column(name = "Tipo_de_Consulta")
    private String tipo_consulta;
    
    @Column(name = "Motivo_Da_Consulta")
    private String motivo_consulta;

    public int getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public Medico getId_medico() {
        return id_medico;
    }

    public void setId_medico(Medico id_medico) {
        this.id_medico = id_medico;
    }

    public Paciente getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Paciente id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipo_consulta() {
        return tipo_consulta;
    }

    public void setTipo_consulta(String tipo_consulta) {
        this.tipo_consulta = tipo_consulta;
    }

    public String getMotivo_consulta() {
        return motivo_consulta;
    }

    public void setMotivo_consulta(String motivo_consulta) {
        this.motivo_consulta = motivo_consulta;
    }

    public Secretario getId_secretario() {
        return id_secretario;
    }

    public void setId_secretario(Secretario id_secretario) {
        this.id_secretario = id_secretario;
    }

    @Override
    public String toString() {
        return "Consulta{" + "id_consulta=" + id_consulta + ", id_medico=" + id_medico + ", id_paciente=" + id_paciente + ", id_secretario=" + id_secretario + ", data=" + data + ", hora=" + hora + ", tipo_consulta=" + tipo_consulta + ", motivo_consulta=" + motivo_consulta + '}';
    }
    
    
    
}
