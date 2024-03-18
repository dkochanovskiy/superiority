package com.company.superiority.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "PLANIN")
@Entity
public class Planin {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "REGNUM", length = 10)
    private String regnum;

    @Column(name = "ORDERNUM", length = 50)
    private String ordernum;

    @JoinTable(name = "PLANIN_CLIENT_LINK",
            joinColumns = @JoinColumn(name = "PLANIN_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "CLIENT_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<Client> provider;

    @Column(name = "PLANARRIVALDATE")
    private LocalDateTime planarrivaldate;

    @Column(name = "VEHNUM", length = 20)
    private String vehnum;

    @Column(name = "CAPACITY", length = 5)
    private String capacity;

    @Column(name = "FIO", length = 100)
    private String fio;

    @Column(name = "PHONE", length = 20)
    private String phone;

    @Column(name = "STATUS", length = 5)
    private String status;

    @Column(name = "STATE", length = 5)
    private String state;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public State getState() {
        return state == null ? null : State.fromId(state);
    }

    public void setState(State state) {
        this.state = state == null ? null : state.getId();
    }

    public Status getStatus() {
        return status == null ? null : Status.fromId(status);
    }

    public void setStatus(Status status) {
        this.status = status == null ? null : status.getId();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Capacity getCapacity() {
        return capacity == null ? null : Capacity.fromId(capacity);
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity == null ? null : capacity.getId();
    }

    public String getVehnum() {
        return vehnum;
    }

    public void setVehnum(String vehnum) {
        this.vehnum = vehnum;
    }

    public LocalDateTime getPlanarrivaldate() {
        return planarrivaldate;
    }

    public void setPlanarrivaldate(LocalDateTime planarrivaldate) {
        this.planarrivaldate = planarrivaldate;
    }

    public List<Client> getProvider() {
        return provider;
    }

    public void setProvider(List<Client> provider) {
        this.provider = provider;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public String getRegnum() {
        return regnum;
    }

    public void setRegnum(String regnum) {
        this.regnum = regnum;
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