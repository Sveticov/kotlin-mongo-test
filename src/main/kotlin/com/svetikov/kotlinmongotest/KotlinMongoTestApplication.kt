package com.svetikov.kotlinmongotest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinMongoTestApplication

fun main(args: Array<String>) {
    runApplication<KotlinMongoTestApplication>(*args)
}
