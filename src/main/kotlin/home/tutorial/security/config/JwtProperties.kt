package home.tutorial.security.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties
data class JwtProperties(
    val key : String,
    val accessTokenExpiration: Long,
    val refreshTokenExpiration: Long
)
