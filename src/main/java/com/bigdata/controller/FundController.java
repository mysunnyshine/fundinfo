package com.bigdata.controller;

import com.bigdata.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weili on 17/8/17.
 */
@Controller("info")
public class FundController {

    @Autowired
    private FundService fundService;
    @RequestMapping(value = "/hello")
    public String hello() {
        return fundService.getInfoList();
    }
}
