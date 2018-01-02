package misty.crm.contact;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.Instant;

@Component
@RepositoryEventHandler(Contact.class)
public class ContactEventHandler {
    private static final Logger logger = LogManager.getLogger(ContactEventHandler.class);

    @HandleBeforeCreate
    public void beforeCreate(Contact contact) {
        contact.setCreatedTime(Timestamp.from(Instant.now()));
    }
}
