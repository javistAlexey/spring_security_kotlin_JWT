package home.tutorial.security.dto

import java.util.UUID

data class UserResponse(
    val uuid: UUID,
    val email: String
)
