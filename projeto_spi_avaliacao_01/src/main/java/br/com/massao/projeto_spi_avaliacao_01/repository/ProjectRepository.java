package br.com.massao.projeto_spi_avaliacao_01.repository;

import br.com.massao.projeto_spi_avaliacao_01.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
