package com.hui.eventanalyse.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hui.eventanalyse.model.relatewordModel;
import com.hui.eventanalyse.service.relatewordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class relatewordController {
    @Autowired
    private relatewordService service;

    @RequestMapping("/relateword_id")
    public Map<String, Object> relateword(@RequestParam("word")String word,@RequestParam("num")int num) {
        Map<String, Object> re= service.relateword_id(word,num);
        return re;
    }


    @RequestMapping("/relateword_all")
    public Map<String, Object> relateword_all() {
        Map<String, Object> re= service.relateword_all();
        return re;
    }
}
