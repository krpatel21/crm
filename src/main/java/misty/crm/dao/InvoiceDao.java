package misty.crm.dao;

import misty.crm.model.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceDao extends CrudRepository<Invoice, Long>{
}
