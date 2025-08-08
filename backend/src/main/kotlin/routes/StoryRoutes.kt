package routes

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Route.storyRoutes() {
    route("/stories") {
        post("/bulk") {
            // TODO: parse JSON array of stories and insert into DB
            call.respondText("Bulk import stub")
        }
        get("/{id}/export") {
            val id = call.parameters["id"]
            // TODO: fetch story and return JSON
            call.respondText("Export story stub for id=$id")
        }
    }
}
