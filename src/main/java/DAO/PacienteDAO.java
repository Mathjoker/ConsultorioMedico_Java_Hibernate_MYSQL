package DAO;

import Model.Cadastro;
import Model.Paciente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PacienteDAO {
    
    private static EntityManagerFactory entityManagerFactory = null;
    
    private static EntityManager manager = null;
    
    public PacienteDAO(){
        entityManagerFactory
            = Persistence.createEntityManagerFactory("gestao_de_consultorio");
        manager
            = entityManagerFactory.createEntityManager();
    }
    
    public void adicionarPaciente(Paciente a){
        manager.getTransaction().begin();
        manager.persist(a);
        manager.getTransaction().commit();
    }
    
    public Paciente buscarPacienteID(int id_paciente){
        Paciente p = manager.find(Paciente.class, id_paciente);
        return p;
    }
    
    public void alterarPaciente(Paciente a){
        manager.getTransaction().begin();
        manager.merge(a);
        manager.getTransaction().commit();
    }
    
    public void removerPaciente(Paciente a){
        manager.getTransaction().begin();
        manager.remove(a);
        manager.getTransaction().commit();
    }
    
    public List<Paciente> buscarPacientes(){
        List<Paciente> pacientes = manager.createQuery("from Paciente")
                .getResultList();
        return pacientes;
    }
    
}
