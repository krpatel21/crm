package misty.crm.invoice;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceDao extends PagingAndSortingRepository<Invoice, Long> {
}
