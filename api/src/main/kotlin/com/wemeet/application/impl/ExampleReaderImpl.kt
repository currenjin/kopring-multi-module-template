package com.wemeet.application.impl

import com.wemeet.application.ExampleReader
import com.wemeet.domain.Example
import com.wemeet.domain.ExampleRepository
import org.springframework.stereotype.Service

@Service
class ExampleReaderImpl(
    private val exampleRepository: ExampleRepository
) : ExampleReader {
    override fun readBy(name: String): Example {
        return exampleRepository.findByName(name).get()
    }
}