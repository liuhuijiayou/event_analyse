package com.hui.eventanalyse.service;

import com.hui.eventanalyse.dao.RelateEntityMapper;
import com.hui.eventanalyse.model.RelateEntityModel;
import com.hui.eventanalyse.model.relatewordModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RelateEntityService {
    @Autowired
    private RelateEntityMapper mapper;

    public  Map<String, Object> relateentity_id(String word,int num,int type){
        List<RelateEntityModel> result = mapper.relateentity_id(word,num,type);
        List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> link = new ArrayList<Map<String, Object>>();
        List<String> nodes = new ArrayList<String>();
        for(int i=0;i<result.size();i++){
            //存储节点
            if(nodes.contains(result.get(i).getEntity_1())==false){
                Map<String, Object> data_map = new HashMap<String, Object>();
                data_map.put("name", String.valueOf(result.get(i).getEntity_1()));
                data_map.put("des", String.valueOf(result.get(i).getEntity_1()));
                data_map.put("symbolSize", 50);
                data_map.put("category", 0);
                data.add(data_map);
                nodes.add(result.get(i).getEntity_1());
            }
            if(nodes.contains(result.get(i).getEntity_2())==false){
                Map<String, Object> data_map = new HashMap<String, Object>();
                data_map.put("name", String.valueOf(result.get(i).getEntity_2()));
                data_map.put("des", String.valueOf(result.get(i).getEntity_2()));
                data_map.put("symbolSize", 50);
                data_map.put("category", 0);
                data.add(data_map);
                nodes.add(result.get(i).getEntity_2());
            }



            //存储边
            Map<String, Object> link_map = new HashMap<String, Object>();
            link_map.put("source",String.valueOf(result.get(i).getEntity_1()));
            link_map.put("target",String.valueOf(result.get(i).getEntity_2()));
            link_map.put("name",String.valueOf(result.get(i).getCo_num()));
            link_map.put("des",String.valueOf(result.get(i).getCo_num()));
            link.add(link_map);
        }


        Map<String, Object> re = new HashMap<String, Object>();
        re.put("data",data);
        re.put("link",link);
        return re;
    }

    public Map<String, Object> relateentity_all() {
        List<RelateEntityModel> result = mapper.relateentity_all();
        List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> link = new ArrayList<Map<String, Object>>();
        List<String> nodes = new ArrayList<String>();
        for(int i=0;i<result.size();i++){
            //存储节点
            if(nodes.contains(result.get(i).getEntity_1())==false){
                Map<String, Object> data_map = new HashMap<String, Object>();
                data_map.put("name", String.valueOf(result.get(i).getEntity_1()));
                data_map.put("des", String.valueOf(result.get(i).getEntity_1()));
                data_map.put("symbolSize", 50);
                data_map.put("category", 0);
                data.add(data_map);
                nodes.add(result.get(i).getEntity_1());
            }
            if(nodes.contains(result.get(i).getEntity_2())==false){
                Map<String, Object> data_map = new HashMap<String, Object>();
                data_map.put("name", String.valueOf(result.get(i).getEntity_2()));
                data_map.put("des", String.valueOf(result.get(i).getEntity_2()));
                data_map.put("symbolSize", 50);
                data_map.put("category", 0);
                data.add(data_map);
                nodes.add(result.get(i).getEntity_2());
            }



            //存储边
            Map<String, Object> link_map = new HashMap<String, Object>();
            link_map.put("source",String.valueOf(result.get(i).getEntity_1()));
            link_map.put("target",String.valueOf(result.get(i).getEntity_2()));
            link_map.put("name",String.valueOf(result.get(i).getCo_num()));
            link_map.put("des",String.valueOf(result.get(i).getCo_num()));
            link.add(link_map);
        }


        Map<String, Object> re = new HashMap<String, Object>();
        re.put("data",data);
        re.put("link",link);
        return re;
    }
}
