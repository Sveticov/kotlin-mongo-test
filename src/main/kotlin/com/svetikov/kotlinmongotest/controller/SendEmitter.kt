package com.svetikov.kotlinmongotest.controller

import com.svetikov.kotlinmongotest.configuration.EventRepository
import com.svetikov.kotlinmongotest.model.Event
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class SendEmitter(val eventRepository: EventRepository) {

    @GetMapping(value = ["/save"],produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun executeExample(@RequestParam("eventName") eventName:String)
    = eventRepository.save(Event(UUID.randomUUID().toString(),eventName)).flux()
}