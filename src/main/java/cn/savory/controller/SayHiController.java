package cn.savory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/tom")
public class SayHiController {

    @RequestMapping("sayhi")
    public ModelAndView index() {

        return new ModelAndView("index");
    }
}
