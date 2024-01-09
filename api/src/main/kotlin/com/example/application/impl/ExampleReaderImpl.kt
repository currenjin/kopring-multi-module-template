package com.example.application.impl

import com.example.application.ExampleReader
import com.example.domain.Example
import com.example.domain.ExampleRepository
import org.springframework.stereotype.Service

@Service
class ExampleReaderImpl(
    private val exampleRepository: ExampleRepository
) : ExampleReader {
    override fun readBy(name: String): Example {
        return exampleRepository.findByName(name).get()
    }
}