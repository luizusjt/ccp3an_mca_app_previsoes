package br.usjt.previsaoDoTempo2.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.previsaoDoTempo2.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Usuario findOneByLoginAndSenha (String login, String senha);
}
