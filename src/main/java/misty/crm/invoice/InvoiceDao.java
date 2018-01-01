package misty.crm.invoice;

import misty.crm.invoice.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceDao extends CrudRepository<Invoice, Long>{
}
