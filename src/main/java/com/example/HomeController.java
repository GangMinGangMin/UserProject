package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("classlist")
    public String calssList(Model model) {

        List<String> list = new ArrayList<String>();
        list.add("실전프로젝트");
        list.add("컴퓨터 비전");

        model.addAttribute("classList", list);
        String msg = "2학년 2학기 교과목 리스트";
        model.addAttribute("title", msg);

        return "list";
    }
}
