//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.site.site;

import java.util.Map;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

    public Controller() {
    }

    @RequestMapping({"/","hello"})
    public ModelAndView hello(Model model) {
        return new ModelAndView("hello", (Map)model);
    }

    @RequestMapping({"/two"})
    public ModelAndView two(Model model) {
        return new ModelAndView("two", (Map)model);
    }

    @RequestMapping({"/help"})
    public ModelAndView help(Model model) {
        return new ModelAndView("help", (Map)model);
    }

    @RequestMapping({"/test_history"})
    public ModelAndView test_history(Model model) {return new ModelAndView("test_history",(Map)model);}

    @RequestMapping({"/other_source"})
    public ModelAndView other_source(Model model) {return new ModelAndView("other_source",(Map)model);}

    @RequestMapping(value = "/test",method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView test(@RequestParam(value = "q1", required = false) String one,
                             @RequestParam(value = "q2", required = false) String two,
                             @RequestParam(value = "q3", required = false) String three,
                             Model model) {
        System.out.print(one);
        System.out.print(two);
        System.out.print(three);
        String result = one + " " + two;
        model.addAttribute("lel",result);
        return new ModelAndView("test",(Map)model);}
}
