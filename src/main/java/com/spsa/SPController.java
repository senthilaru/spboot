package com.spsa;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SPController {
    
    @GetMapping(path="/spsa")
    public Map<String,String> getName(){
        Map<String, String> map = new HashMap<>();
        map.put("name", "SPSA");
        return map;
    }
}
