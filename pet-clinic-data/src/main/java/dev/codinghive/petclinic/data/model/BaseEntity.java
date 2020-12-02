package dev.codinghive.petclinic.data.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    //Hibernate recommendations to use Long instead of long, because that can have null
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
