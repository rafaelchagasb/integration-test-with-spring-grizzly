package br.com.rafaelchagasb.interfaces;

import java.util.List;

import br.com.rafaelchagasb.entities.Produto;

public interface IProdutoService{
	 
	String save();
	
	List<Produto> listAll();
 
}