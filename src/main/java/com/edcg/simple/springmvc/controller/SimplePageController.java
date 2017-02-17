/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edcg.simple.springmvc.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author edgar
 */
@Controller
@Scope("request")
public class SimplePageController {
    
    @RequestMapping(value="/helloworld",method=RequestMethod.GET)
    public String helloworld(){
        return "simplepage";
    }
}
