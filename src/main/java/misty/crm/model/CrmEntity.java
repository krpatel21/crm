package misty.crm.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;

@MappedSuperclass
public abstract class CrmEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "creator_id")
    private User creator;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;
    @ManyToOne
    @JoinColumn(name = "modified_by_id")
    private User modifiedBy;
    @Column
    @Type(type = "text")
    private String description;
    @Column
    private Timestamp createdTime;
    @Column
    private Timestamp modifiedTime;
    @Column
    private Timestamp viewedTime;

    public CrmEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public User getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(User modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Timestamp getViewedTime() {
        return viewedTime;
    }

    public void setViewedTime(Timestamp viewedTime) {
        this.viewedTime = viewedTime;
    }
}
