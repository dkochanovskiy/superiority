package com.company.superiority.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum State implements EnumClass<String> {

    WAITINGGATES("5"),
    ONGATES("20"),
    DEPARTUREALLOWED("50");

    private final String id;

    State(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static State fromId(String id) {
        for (State at : State.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}