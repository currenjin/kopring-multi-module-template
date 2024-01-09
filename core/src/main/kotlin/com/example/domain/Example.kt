package com.example.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.jetbrains.annotations.NotNull

@Entity
class Example() {
    constructor(name: String) : this() {
        this.name = name
    }

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long = 0

    @NotNull
    private lateinit var name: String

    fun getName(): String = this.name
}