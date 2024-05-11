package home.tutorial.security.dto

data class AuthenticationRequest(
    val email: String,
    val password: String
) {
}