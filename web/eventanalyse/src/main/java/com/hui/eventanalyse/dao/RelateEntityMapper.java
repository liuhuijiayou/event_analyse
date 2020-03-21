package com.hui.eventanalyse.dao;

import com.hui.eventanalyse.model.RelateEntityModel;
import com.hui.eventanalyse.model.relatewordModel;

import java.util.List;

public interface RelateEntityMapper {
    List<RelateEntityModel> relateentity_id(String word, int num,int type);

    List<RelateEntityModel> relateentity_all();
}
