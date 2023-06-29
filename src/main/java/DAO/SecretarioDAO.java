package DAO;

import Model.Secretario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SecretarioDAO {
    
    private static EntityManagerFactory entityManagerFactory = null;
    
    private static EntityManager manager = null;
    
    public SecretarioDAO(){
        entityManagerFactory
            = Persistence.createEntityManagerFactory("gestao_de_consultorio");
        manager
            = entityManagerFactory.createEntityManager();
    }
    
    public void adicionarSecretario(Secretario a){
        manager.getTransaction().begin();
        manager.persist(a);
        manager.getTransaction().commit();
    }
    
    public Secretario buscarSecretarioID(int id_secretario){
        Secretario a = manager.find(Secretario.class, id_secretario);
        return a;
    }
    
    public void alterarSecretario(Secretario a){
        manager.getTransaction().begin();
        manager.merge(a);
        manager.getTransaction().commit();
    }
    
    public void removerSecretario(Secretario a){
        manager.getTransaction().begin();
        manager.remove(a);
        manager.getTransaction().commit();
    }
    
    public List<Secretario> buscarSecretarios(){
        List<Secretario> secretarios = manager.createQuery("from Secretario")
                .getResultList();
        return secretarios;
    }
    
}
