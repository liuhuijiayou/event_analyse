package com.hui.eventanalyse.dao;
import java.util.List;
import  com.hui.eventanalyse.model.relatewordModel;
public interface relatewordMapper {
    List<relatewordModel> relateword_id(String word,int num);
    List<relatewordModel> relateword_all();
}
