package com.svetikov.kotlinmongotest.configuration

import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration
import org.springframework.data.mongodb.core.ReactiveMongoTemplate

import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@Configuration
@EnableReactiveMongoRepositories(
        basePackageClasses = [EventRepository::class]
)
class MongoConfig:AbstractReactiveMongoConfiguration() {
    override fun getDatabaseName(): String = "mongoDatabase"

    override fun reactiveMongoClient(): MongoClient
    = mongoClient()

    @Bean
    fun mongoClient():MongoClient = MongoClients.create()

    @Bean
    override  fun reactiveMongoTemplate(): ReactiveMongoTemplate
    = ReactiveMongoTemplate(mongoClient(), databaseName)
}