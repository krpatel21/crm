package misty.crm.contact;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends PagingAndSortingRepository<Contact, Long> {
    @Override
    @PreAuthorize("@contactRepository.findOne(#id)?.owner?.username == authentication.name")
    void delete(@Param("id") Long aLong);

    @Override
    @PreAuthorize("#contact.owner?.username == authenication.name")
    void delete(@Param("contact") Contact entity);
}
