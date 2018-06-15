/*
 * Javalin - https://javalin.io
 * Copyright 2017 David Åse
 * Licensed under Apache 2.0: https://github.com/tipsy/javalin/blob/master/LICENSE
 */

package io.javalin.websocket.handler;

import io.javalin.websocket.WsSession;

@FunctionalInterface
public interface CloseHandler {
    void handle(WsSession session, int statusCode, String reason) throws Exception;
}
