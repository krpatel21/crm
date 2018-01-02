package misty.crm.contact;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDao extends PagingAndSortingRepository<Contact, Long> {
}
