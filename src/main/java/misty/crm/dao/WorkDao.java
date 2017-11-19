package misty.crm.dao;

import misty.crm.model.Worker;
import org.springframework.data.repository.CrudRepository;

public interface WorkDao extends CrudRepository<Worker, Long> {
}
