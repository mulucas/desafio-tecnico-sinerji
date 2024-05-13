package br.com.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.model.Estado;

import java.util.List;

@ManagedBean
@ViewScoped
public class EstadoBean {

	public List<Estado> getEstados() {
		return Estado.listarEstados();
	}
}