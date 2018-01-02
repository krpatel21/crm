package misty.crm.contact;

import misty.crm.core.CrmEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Contact extends CrmEntity {

    @Column
    @NotNull
    @Size(min = 1, max = 40)
    private String firstName;
    @Column
    @NotNull
    @Size(min = 1, max = 80)
    private String lastName;
    @Column
    @Size(min = 1, max = 100)
    private String email;
    @Column
    @Size(min = 1, max = 50)
    private String phone;

    protected Contact() {
        super();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
