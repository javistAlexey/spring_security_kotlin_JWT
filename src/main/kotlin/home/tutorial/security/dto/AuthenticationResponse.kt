package home.tutorial.security.dto

data class AuthenticationResponse(
    val accessToken: String,
    val refreshToken: String
)
