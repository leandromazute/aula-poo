package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.DAOCidade;
import dao.DAOEstado;
import entidade.Cidade;
import entidade.Estado;
import fabrica.Fabrica;

public class Principal {
	
	EntityManager gerenciador = Fabrica.get().createEntityManager();
	EntityTransaction transacao = gerenciador.getTransaction();
	
	public static void main (String[] args) {
		
		DAOEstado daoEst = new DAOEstado();
		DAOCidade daoCid = new DAOCidade();
		Estado estado = new Estado();
		Cidade cid = new Cidade();
		
		estado.setNome("Paraná");
		estado.setSigla("PR");
		
		cid.setNome("Panaravaí");
		Estado est = daoEst.listar(Estado.class, 1);
		cid.setEstado(est);
		daoCid.salvar(cid);
		
		
		
		
		
	}

}
