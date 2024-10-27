package br.com.adeliadev.to_do_list.repository;

import br.com.adeliadev.to_do_list.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
