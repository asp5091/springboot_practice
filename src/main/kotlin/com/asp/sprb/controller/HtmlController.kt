package com.asp.sprb.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class HtmlController {

    @GetMapping("/")
    fun index(model:Model):String{
        return "index"
    }

    @GetMapping("/{formType}")
    fun htmlForm(model: Model, @PathVariable formType: String): String {
        model.addAttribute("title", formType.uppercase())
        return "${formType}"
    }

    /*
    @GetMapping("/login")
    fun htmlFormLogin(model: Model): String {
        return "login"
    }
    */
}