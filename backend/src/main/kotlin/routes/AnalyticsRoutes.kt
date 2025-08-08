package routes

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Route.analyticsRoutes() {
    route("/analytics") {
        get("/funnel") {
            // TODO: query funnel drop-off rates
            call.respondText("Funnel metrics stub")
        }
    }
}
