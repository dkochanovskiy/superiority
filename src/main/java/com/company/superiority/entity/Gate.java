package com.company.superiority.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.UUID;

@JmixEntity
@Table(name = "GATE", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_GATE_UNQ_GATESNUM", columnNames = {"GATESNUM"})
})
@Entity
public class Gate {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "GATESNUM", length = 5)
    private String gatesnum;

    @Column(name = "FROM_")
    private LocalTime from;

    @Column(name = "TO_")
    private LocalTime to;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public LocalTime getTo() {
        return to;
    }

    public void setTo(LocalTime to) {
        this.to = to;
    }

    public LocalTime getFrom() {
        return from;
    }

    public void setFrom(LocalTime from) {
        this.from = from;
    }

    public String getGatesnum() {
        return gatesnum;
    }

    public void setGatesnum(String gatesnum) {
        this.gatesnum = gatesnum;
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