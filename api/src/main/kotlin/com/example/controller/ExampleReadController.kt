package com.example.controller

import com.example.application.ExampleReader
import com.example.controller.response.ExampleResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/example")
class ExampleReadController(
    val exampleReader: ExampleReader,
) {
    @GetMapping("/{name}")
    fun getExample(@PathVariable(value = "name") name: String): ResponseEntity<ExampleResponse> {
        val example = exampleReader.readBy(name)
        val exampleDto = ExampleResponse(example.getName())
        return ResponseEntity.ok(exampleDto)
    }
}