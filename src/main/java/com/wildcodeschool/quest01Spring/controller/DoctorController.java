package com.wildcodeschool.quest01Spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String firstDoctor() {
        return "<a href='https://en.wikipedia.org/wiki/William_Hartnell' target='_blank'>William Hartnell</a>";

    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String tenthDoctor() {
        return "<a href='https://fr.wikipedia.org/wiki/David_Tennant' target='_blank'>David Tennant</a>";

    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String thirteenthDoctor() {
        return "<a href='https://fr.wikipedia.org/wiki/Jodie_Whittaker' target='_blank'>Jodie Whittaker</a>";

    }
}
