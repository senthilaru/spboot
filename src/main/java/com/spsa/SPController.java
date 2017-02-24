package com.spsa;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/spsa")
public class SPController {
    
    @GetMapping("/name")
    public Map<String,String> getName(){
        Map<String, String> map = new HashMap<>();
        map.put("name", "SenthilSP");
        return map;
    }
}
