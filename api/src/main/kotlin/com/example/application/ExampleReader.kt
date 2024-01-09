package com.example.application

import com.example.domain.Example

interface ExampleReader {
    fun readBy(name: String): Example
}