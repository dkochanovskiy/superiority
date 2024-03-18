package com.company.superiority.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "CLIENT", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_CLIENT_UNQ_CLIENTCODE", columnNames = {"CLIENTCODE"})
})
@Entity
public class Client {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "CLIENTCODE")
    private Integer clientcode;

    @InstanceName
    @Column(name = "NAME", length = 200)
    private String name;

    @Column(name = "ADDRESS", length = 200)
    private String address;

    @Column(name = "CONTACTPERSON", length = 100)
    private String contactperson;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;
    @JoinTable(name = "PLANIN_CLIENT_LINK",
            joinColumns = @JoinColumn(name = "CLIENT_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "PLANIN_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<Planin> planins;

    public List<Planin> getPlanins() {
        return planins;
    }

    public void setPlanins(List<Planin> planins) {
        this.planins = planins;
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClientcode() {
        return clientcode;
    }

    public void setClientcode(Integer clientcode) {
        this.clientcode = clientcode;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}