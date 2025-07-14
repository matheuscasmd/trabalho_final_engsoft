package entidades;

import entidades.enums.StatusExemplar;
import entidades.usuarios.Usuario;

public class Exemplar {
	
	private int codigoExemplar;
	private StatusExemplar status = StatusExemplar.DISPONIVEL;
	private Usuario emprestadoPara;
	
	
	public Exemplar(int exemplar) {
		this.setCodigoExemplar(exemplar);
	}


	public int getCodigoExemplar() {
		return codigoExemplar;
	}


	public void setCodigoExemplar(int codigoExemplar) {
		this.codigoExemplar = codigoExemplar;
	}

	public StatusExemplar getStatus() {
		return status;
	}

	public void setStatus(StatusExemplar status) {
		this.status = status;
	}

	public Usuario getEmprestadoPara() {
		return emprestadoPara;
	}

	public void setEmprestadoPara(Usuario emprestadoPara) {
		this.emprestadoPara = emprestadoPara;
	}
	
	
}
