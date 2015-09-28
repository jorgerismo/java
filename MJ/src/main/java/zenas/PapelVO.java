package zenas;

public class PapelVO {
	private String nome;
	private Long id;
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
	public PapelVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PapelVO(String nome, Long id) {
		super();
		this.nome = nome;
		this.id = id;
	}
	
}
