package br.com.caelum.livraria.modelo;

import org.primefaces.model.LazyDataModel;

import br.com.caelum.livraria.dao.DAO;

// improve performance by searching books in the database
public class LivroDataModel extends LazyDataModel<Livro> {

	
	private static final long serialVersionUID = 1L;

	DAO<Livro> dao = new DAO<Livro>(Livro.class);

	public LivroDataModel() {
		super.setRowCount(dao.quantidadeDeElementos());
	}	
}
