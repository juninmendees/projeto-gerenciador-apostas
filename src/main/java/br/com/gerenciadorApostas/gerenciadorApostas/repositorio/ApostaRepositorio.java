package br.com.gerenciadorApostas.gerenciadorApostas.repositorio;

import br.com.gerenciadorApostas.gerenciadorApostas.model.Aposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApostaRepositorio extends JpaRepository <Aposta, Long> {
}
