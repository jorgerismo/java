package zenas;

import java.util.List;

public class Usuario {

	private String nome;
	private Long id;
	private Long idPapel;
	private String nomePapel;
	private List<PapelVO> papelList;
	
	public Long getIdPapel() {
		return idPapel;
	}
	public void setIdPapel(Long idPapel) {
		this.idPapel = idPapel;
	}
	public String getNomePapel() {
		return nomePapel;
	}
	public void setNomePapel(String nomePapel) {
		this.nomePapel = nomePapel;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Usuario(String nome, Long id, Long idPapel, String nomePapel) {
		super();
		this.nome = nome;
		this.id = id;
		this.idPapel = idPapel;
		this.nomePapel = nomePapel;
	}
	public List<PapelVO> getPapelList() {
		return papelList;
	}
	public void setPapelList(List<PapelVO> papelList) {
		this.papelList = papelList;
	}
	public Usuario(String nome, Long id) {
		super();
		this.nome = nome;
		this.id = id;
	}
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

}
