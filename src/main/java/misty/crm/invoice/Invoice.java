package misty.crm.invoice;

import misty.crm.core.CrmEntity;
import misty.crm.user.User;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Invoice extends CrmEntity {
    @Column
    private BigDecimal amount;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Invoice() {
        super();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
