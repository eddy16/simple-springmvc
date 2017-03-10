package com.edcg.simple.springmvc.persistence.model.generic;

import java.io.Serializable;

/**
 * Created by Edgar on 08/03/2017.
 */
public abstract class GenericModel<T> implements Serializable {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
