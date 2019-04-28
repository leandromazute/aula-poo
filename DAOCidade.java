package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entidade.Cidade;
import fabrica.Fabrica;

public class DAOCidade {
	private EntityManagerFactory fabrica = Fabrica.get();
	private EntityManager gerenciador = fabrica.createEntityManager();
	private EntityTransaction transacao = gerenciador.getTransaction();
	
	public void salvar(Cidade cid) {
		try {
			transacao.begin();
			gerenciador.persist(cid);
			transacao.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}finally {
			gerenciador.close();
		}
	}


}
