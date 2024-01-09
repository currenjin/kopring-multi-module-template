package com.wemeet.application

import com.wemeet.domain.Example

interface ExampleReader {
    fun readBy(name: String): Example
}