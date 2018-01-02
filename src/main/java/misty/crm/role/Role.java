package misty.crm.role;

import misty.crm.core.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Role extends BaseEntity {
    private String name;

    public Role() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
