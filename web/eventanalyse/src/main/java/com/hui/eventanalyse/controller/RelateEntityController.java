package com.hui.eventanalyse.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hui.eventanalyse.model.RelateEntityModel;
import com.hui.eventanalyse.service.RelateEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RelateEntityController {
    @Autowired
    private RelateEntityService service;
    @RequestMapping("/relateentity_id")
    public Map<String, Object> relateEntity(@RequestParam("word")String word,@RequestParam("num")int num,@RequestParam("type")int type) {
        Map<String, Object> re= service.relateentity_id(word,num,type);
        return re;
    }
    @RequestMapping("/relateentity_all")
    public Map<String, Object> relateentity_all() {
        Map<String, Object> re= service.relateentity_all();
        return re;
    }
}
