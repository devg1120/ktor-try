package com.example
import com.example.model.FakeTaskRepository
import com.example.model.PostgresTaskRepository

import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

/*
fun Application.module() {
    val repository = FakeTaskRepository()

    configureSerialization(repository)
    //configureDatabases()
    configureRouting()
}
*/

fun Application.module() {
    val repository = PostgresTaskRepository()

    configureSerialization(repository)
    configureDatabases()
    configureRouting()
}

