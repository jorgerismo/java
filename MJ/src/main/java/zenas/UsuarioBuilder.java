package zenas;


public class UsuarioBuilder implements IUsuarioBuilder{

	@Override
	public Usuario criarUsuarioComPapelAdmNaInf() {
		return new Usuario("Jorge", 1L, 20L, "INF");
	}

	@Override
	public Usuario criarUsuarioPapelAdministracao() {
		return new Usuario("Zenas", 2L, 21L, "ADM");
	}

	@Override
	public Usuario criarUsuarioPapelInformatica() {
		return new Usuario("Gustavo", 3L, 20L, "INF");
	}

	@Override
	public Usuario criarUsuarioPapelGD() {
		return new Usuario("Jorge", 1L, 22L, "GD");
	}

}
