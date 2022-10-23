package com.romanredziuk.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "myView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model){
//
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description", "- new employee");
//
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model){

        empName = "Mr. " + empName;

        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", "- new employee");

        return "show-emp-details-view";
    }
}
