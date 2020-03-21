package com.hui.eventanalyse.model;
import java.io.Serializable;
public class relatewordModel implements Serializable{
    private static final long serialVersionUID = 1L;
    private String word_1;
    private String word_2;
    private String co_num;

    public String getWord_1() {
        return word_1;
    }

    public String getWord_2() {
        return word_2;
    }

    public String getCo_num() {
        return co_num;
    }

    public void setWord_1(String word_1) {
        this.word_1 = word_1;
    }

    public void setWord_2(String word_2) {
        this.word_2 = word_2;
    }

    public void setCo_num(String co_num) {
        this.co_num = co_num;
    }
}
