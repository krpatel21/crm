package misty.crm.dao;

import misty.crm.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDao extends CrudRepository<Contact, Long> {
}
