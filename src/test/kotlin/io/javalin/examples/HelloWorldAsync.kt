/*
 * Javalin - https://javalin.io
 * Copyright 2017 David Åse
 * Licensed under Apache 2.0: https://github.com/tipsy/javalin/blob/master/LICENSE
 */

package io.javalin.examples

import io.javalin.Javalin
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    Javalin.create().apply {
        get("/") { ctx ->
            val future = CompletableFuture<String>()
            Executors.newSingleThreadScheduledExecutor().schedule({ future.complete("Hello World!") }, 10, TimeUnit.MILLISECONDS)
            ctx.result(future)
        }
    }.start(7070)
}
