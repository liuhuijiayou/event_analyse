package com.hui.eventanalyse.model;
import java.io.Serializable;

public class RelateEntityModel implements Serializable{
    private static final long serialVersionUID = 1L;

    public String getEntity_1() {
        return entity_1;
    }

    public void setEntity_1(String entity_1) {
        this.entity_1 = entity_1;
    }

    public String getEntity_1_type() {
        return entity_1_type;
    }

    public void setEntity_1_type(String entity_1_type) {
        this.entity_1_type = entity_1_type;
    }

    public String getEntity_2() {
        return entity_2;
    }

    public void setEntity_2(String entity_2) {
        this.entity_2 = entity_2;
    }

    public String getEntity_2_type() {
        return entity_2_type;
    }

    public void setEntity_2_type(String entity_2_type) {
        this.entity_2_type = entity_2_type;
    }

    public String getCo_num() {
        return co_num;
    }

    public void setCo_num(String co_num) {
        this.co_num = co_num;
    }

    private String entity_1;
    private String entity_1_type;
    private String entity_2;
    private String entity_2_type;
    private String co_num;
}
