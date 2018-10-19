package main.model;

public class Erba {

	private int idErba;
	private String nomeErba;
	private String descErba;

	public Erba() {

	}

	public Erba(int idErba, String nomeErba, String descErba) {
		this.idErba = idErba;
		this.nomeErba = nomeErba;
		this.descErba = descErba;
	}

	public int getIdErba() {
		return idErba;
	}

	public void setIdErba(int idErba) {
		this.idErba = idErba;
	}

	public String getNomeErba() {
		return nomeErba;
	}

	public void setNomeErba(String nomeErba) {
		this.nomeErba = nomeErba;
	}

	public String getDescErba() {
		return descErba;
	}

	public void setDescErba(String descErba) {
		this.descErba = descErba;
	}

}
