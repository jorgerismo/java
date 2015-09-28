package zenas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Capitulo7Ex9 {

	public static void main(String[] args) {
		IUsuarioBuilder usuarioBuilder = new UsuarioBuilder();
		List<Usuario> usuarios = Arrays.asList(
				usuarioBuilder.criarUsuarioComPapelAdmNaInf(),
				usuarioBuilder.criarUsuarioPapelAdministracao(), 
				usuarioBuilder.criarUsuarioPapelGD(),
				usuarioBuilder.criarUsuarioPapelInformatica());

		List<Usuario> usuarioComPerfil = new ArrayList<Usuario>();
		Map<Long, List<Usuario>> usuarioMap = usuarios.stream().collect(Collectors.groupingBy(Usuario::getId));
		
		usuarioMap.forEach( (i, j) -> {
			Usuario user = new Usuario();
			user.setId(i);
			user.setPapelList( new ArrayList<PapelVO>() );
			
			j.stream().forEach( u -> {
				PapelVO papelVO = new PapelVO();
				user.setNome( u.getNome() );
				papelVO.setId( u.getIdPapel());
				papelVO.setNome( u.getNomePapel() );
				user.getPapelList().add(papelVO);
			
			});
			usuarioComPerfil.add(user);
			
		});
		
		usuarioComPerfil.forEach( u -> {  
			System.out.println( "IdUsuario: " + u.getId() + "NomeUser: " + u.getNome() + "Papel: " + u.getPapelList() );
		} );
		
	}

}
