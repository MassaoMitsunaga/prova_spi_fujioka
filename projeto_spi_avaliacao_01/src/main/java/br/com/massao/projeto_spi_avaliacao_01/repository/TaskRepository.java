package br.com.massao.projeto_spi_avaliacao_01.repository;

import br.com.massao.projeto_spi_avaliacao_01.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;


public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByStartDateGreaterThanEqualAndEndDateLessThanEqual(LocalDate startDate, LocalDate endDate);

    List<Task> findByStatus(Long status);

    List<Task> findByStartDateGreaterThanEqualAndEndDateLessThanEqualAndStatusIs(LocalDate startDate, LocalDate endDate, Long status);
}
