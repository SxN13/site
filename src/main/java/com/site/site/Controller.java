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

    @RequestMapping(value = "/test_history")
    public ModelAndView test_history_view(Model model) {
        return new ModelAndView("test_history",(Map)model);
    }
//    @RequestMapping(value = "/fl_name",method = {RequestMethod.POST,RequestMethod.GET})
//    public ModelAndView student_check(@RequestParam(value = "ln", required = false) String ln,
//                                      @RequestParam(value = "fn", required = false) String fn,
//                                      @RequestParam(value = "gr", required = false) String gr,
//                                      Model model){
//        System.out.println(ln);
//        System.out.println(fn);
//        System.out.println(gr);
//        return new ModelAndView("test_history",(Map)model);
//    }
    @RequestMapping(value = "/test",method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView test_history(@RequestParam(value = "q1", required = false) String q1,
                                     @RequestParam(value = "q1", required = false) String q2,
                                     @RequestParam(value = "q3", required = false) String q3,
                                     @RequestParam(value = "q4", required = false) String q4,
                                     @RequestParam(value = "q5", required = false) String q5,
                                     @RequestParam(value = "q6", required = false) String q6,
                                     @RequestParam(value = "q7", required = false) String q7,
                                     @RequestParam(value = "l_n", required = false) String ln,
                                     @RequestParam(value = "f_n", required = false) String fn,
                                     @RequestParam(value = "gr", required = false) String gr,
                                     Model model) {
        int true_count = 0;
        String resu = ln + " " + fn + " " + gr;
        System.out.println(resu);
        if(q1.toLowerCase().equals("шиккард паскаль лейбниц") ||
                q1.toLowerCase().equals("шиккард лейбниц паскаль") ||
                q1.toLowerCase().equals("лейбниц шиккард паскаль") ||
                q1.toLowerCase().equals("лейбниц паскаль шиккард") ||
                q1.toLowerCase().equals("паскаль лейбниц шиккард") ||
                q1.toLowerCase().equals("паскаль шиккард лейбниц")){
            true_count +=1;
        }
        if(q2.toLowerCase().equals("м.а. бонч-бруевич") || q2.toLowerCase().equals("бонч-бруевич")){
            true_count +=1;
        }
        if(q3.toLowerCase().equals("фон нейман") || q3.toLowerCase().equals("нейман")){
            true_count +=1;
        }
        if(q4.toLowerCase().equals("г. лейбниц") || q4.toLowerCase().equals("лейбниц")){
            true_count +=1;
        }
        if(q5.equals("1977") ){
            true_count +=1;
        }
        if(q6.toLowerCase().equals("ада лавлейс (байрон)") ||
                q6.toLowerCase().equals("ада байрон") ||
                q6.toLowerCase().equals("ада")){
            true_count +=1;
        }
        if(q7.equals("1949")){
            true_count +=1;
        }
        String result = "Правильно " + true_count + "/7";
        model.addAttribute("rez",result);

        return new ModelAndView("test_history",(Map)model);
    }

    @RequestMapping({"/other_source"})
    public ModelAndView other_source(Model model) {return new ModelAndView("other_source",(Map)model);}

    @RequestMapping(value = "/tes",method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView test(@RequestParam(value = "q1", required = false) String one,
                             @RequestParam(value = "q2", required = false) String two,
                             @RequestParam(value = "q3", required = false) String three,
                             Model model) {
        int true_count = 0;
        String result = "dsds";
        model.addAttribute("lel",result);
        return new ModelAndView("test",(Map)model);}
    }
