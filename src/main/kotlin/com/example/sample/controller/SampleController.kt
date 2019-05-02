package com.example.sample.controller

import com.example.sample.service.SampleService
import org.springframework.stereotype.Controller
import org.springframework.ui.set
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SampleController (private val service: SampleService){

    @GetMapping("/")
    fun index(model: Model): String {
        model["modelList"] = service.find()
        return "index"
    }

}