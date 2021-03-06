package com.svetikov.kotlinmongotest.model

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Event(
        val id: String,
        val name: String)