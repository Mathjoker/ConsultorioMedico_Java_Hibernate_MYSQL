package DAO;

import Model.Medico;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MedicoDAO {
    
    private static EntityManagerFactory entityManagerFactory = null;
    
    private static EntityManager manager = null;
    
    public MedicoDAO(){
        entityManagerFactory
            = Persistence.createEntityManagerFactory("gestao_de_consultorio");
        manager
            = entityManagerFactory.createEntityManager();
    }
    
    public void adicionarMedico(Medico a){
        manager.getTransaction().begin();
        manager.persist(a);
        manager.getTransaction().commit();
    }
    
    public Medico buscarMedicoID(int id_medico){
        Medico a = manager.find(Medico.class, id_medico);
        return a;
    }
    
    public void alterarMedico(Medico a){
        manager.getTransaction().begin();
        manager.merge(a);
        manager.getTransaction().commit();
    }
    
    public void removerMedico(Medico a){
        manager.getTransaction().begin();
        manager.remove(a);
        manager.getTransaction().commit();
    }
    
    public List<Medico> buscarMedicos(){
        List<Medico> medicos = manager.createQuery("from Medico")
                .getResultList();
        return medicos;
    }
    
}
