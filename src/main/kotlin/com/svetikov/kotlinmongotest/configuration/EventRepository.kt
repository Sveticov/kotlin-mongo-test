package com.svetikov.kotlinmongotest.configuration

import com.svetikov.kotlinmongotest.model.Event
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface EventRepository : ReactiveCrudRepository<Event,String> {

}
