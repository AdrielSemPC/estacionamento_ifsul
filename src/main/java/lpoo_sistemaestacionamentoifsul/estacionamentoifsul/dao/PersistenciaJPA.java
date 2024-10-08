/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpoo_sistemaestacionamentoifsul.estacionamentoifsul.dao;

import javax.persistence.*;

/**
 *
 * @author 20241PF.CC0029
 */
public class PersistenciaJPA implements InterfaceBD{
    EntityManager entity;
    EntityManagerFactory factory;
    
    public PersistenciaJPA(){
        factory = Persistence.createEntityManagerFactory("PU_LPOO_SISTEMAESTACIONAMENTO");
        entity = factory.createEntityManager();
        
    }
    
    @Override
    public Boolean conexaoAberta(){
        return entity.isOpen();
    }
    
    @Override
    public void fecharConexao(){
        entity.close();
    }
    
    public Object find(Class c, Object id) throws Exception{
        return null;
    }
    
    @Override
    public void persist(Object o) throws Exception{
        
    }
    
    
    @Override
    public void remover(Object o) throws Exception{
    
    }
}
