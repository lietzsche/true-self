package models

import kotlinx.serialization.Serializable

@Serializable
data class StoryNode(
    val id: String,
    val text: String,
    val edges: List<StoryEdge> = emptyList()
)

@Serializable
data class StoryEdge(
    val target: String,
    val label: String
)
