package com.company.superiority.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum Status implements EnumClass<String> {

    PLANNED("10"),
    REGISTERED("20"),
    ONGATES("30"),
    ALLOWEDOUT("50"),
    DEPARTURED("90");

    private final String id;

    Status(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Status fromId(String id) {
        for (Status at : Status.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}