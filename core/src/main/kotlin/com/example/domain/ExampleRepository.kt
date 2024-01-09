package com.example.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ExampleRepository: JpaRepository<Example, Long> {
    fun findByName(name: String): Optional<Example>
}