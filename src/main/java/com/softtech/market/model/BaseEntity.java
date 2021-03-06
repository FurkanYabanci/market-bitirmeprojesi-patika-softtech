package com.softtech.market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements BaseModel,Cloneable, Serializable {

    @Embedded
    private BaseAdditionalFields baseAdditionalFields;
}
