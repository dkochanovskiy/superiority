package com.company.superiority.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum Capacity implements EnumClass<String> {

    GAZEL("1"),
    FURA("2");

    private final String id;

    Capacity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Capacity fromId(String id) {
        for (Capacity at : Capacity.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}