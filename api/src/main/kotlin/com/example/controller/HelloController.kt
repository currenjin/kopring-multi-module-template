package com.example.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class HelloController {
    @GetMapping("/hello")
    fun hello(): String {
        return "annyeong"
    }
}