package com.tnsi.messagerie.primary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;

@Controller
public class RequestController {
    @GetMapping("/")
    public String singupRequest(){
        return "form";
    }
}
