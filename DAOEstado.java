package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entidade.Estado;
import fabrica.Fabrica;

public class DAOEstado {
	
	EntityManagerFactory fabrica = Fabrica.get();
	EntityManager gerenciador = fabrica.createEntityManager();
	EntityTransaction transacao = gerenciador.getTransaction();
	
	public void salvar(Estado estado) {
		try {
			transacao.begin();
			gerenciador.persist(estado);
			transacao.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally {
			gerenciador.close();
		}
	}
	
	public Estado listar(Class Estado, long id) {
		try {
			return (Estado) gerenciador.find(Estado, id);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			gerenciador.close();
		}
	}

}
