package com.melnik.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
public class MyControlLer {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("askDetail")
    public String askEmployeeDetails() {
        return "ask-emp-details-employee";
    }

//    @RequestMapping("showDetails")
//    public String showEmpDetails(HttpServletRequest servletRequest, Model model) {
//        String name = servletRequest.getParameter("employeeName");
//        name = "Mr " + name;
//        model.addAttribute("nameAttribute", name);
//        model.addAttribute("description", "- udemi instructor");
//
//        return "show-emp-details";
//    }

    @RequestMapping("showDetails")
    public String showEmpDetails(@RequestParam("employeeName") String name, Model model) {
        name = "Mr. " + name + "!";
        model.addAttribute("nameAttribute", name);
        return "show-emp-details";
    }
}
