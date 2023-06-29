package DAO;

import Model.Consulta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConsultaDAO {
    
    private static EntityManagerFactory entityManagerFactory = null;
    
    private static EntityManager manager = null;
    
    public ConsultaDAO(){
        entityManagerFactory
            = Persistence.createEntityManagerFactory("gestao_de_consultorio");
        manager
            = entityManagerFactory.createEntityManager();
    }
    
    public void adicionarConsulta(Consulta a){
        manager.getTransaction().begin();
        manager.persist(a);
        manager.getTransaction().commit();
    }
    
    public Consulta buscarConsultaID(int id_consulta){
        Consulta a = manager.find(Consulta.class, id_consulta);
        return a;
    }
    
    public void alterarConsulta(Consulta a){
        manager.getTransaction().begin();
        manager.merge(a);
        manager.getTransaction().commit();
    }
    
    public void removerConsulta(Consulta a){
        manager.getTransaction().begin();
        manager.remove(a);
        manager.getTransaction().commit();
    }
    
    public List<Consulta> buscarConsultas(){
        List<Consulta> consultas = manager.createQuery("from Consulta")
                .getResultList();
        return consultas;
    }
    
    public void excluirConsultasPorIdPaciente(int idPaciente){
        
        String hql = "from Consulta where Id_Paciente = :idPaciente";
        List<Consulta> consultas = manager.createQuery(hql, Consulta.class)
                .setParameter("idPaciente", idPaciente)
                .getResultList();
    
        manager.getTransaction().begin();
        
        for (Consulta consulta : consultas){
            
            manager.remove(consulta);
            
        }
        
    manager.getTransaction().commit();
}
    
    public void excluirConsultasPorIdMedico(int idMedico){
        
        String hql = "from Consulta where Id_Medico = :idMedico";
        List<Consulta> consultas = manager.createQuery(hql, Consulta.class)
                .setParameter("idMedico", idMedico)
                .getResultList();
    
        manager.getTransaction().begin();
        
        for (Consulta consulta : consultas){
            
            manager.remove(consulta);
            
        }
        
    manager.getTransaction().commit();
}
    
    public void excluirConsultasPorIdSecretario(int idSecretario){
        
        String hql = "from Consulta where Id_Secretario = :idSecretario";
        List<Consulta> consultas = manager.createQuery(hql, Consulta.class)
                .setParameter("idSecretario", idSecretario)
                .getResultList();
    
        manager.getTransaction().begin();
        
        for (Consulta consulta : consultas){
            
            manager.remove(consulta);
            
        }
        
    manager.getTransaction().commit();
}
    
}

