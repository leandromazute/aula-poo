package entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marca {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idMarca;
	private String nomeMarca;
	private String descricao;
	public long getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(long idMarca) {
		this.idMarca = idMarca;
	}
	public String getNomeMarca() {
		return nomeMarca;
	}
	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
