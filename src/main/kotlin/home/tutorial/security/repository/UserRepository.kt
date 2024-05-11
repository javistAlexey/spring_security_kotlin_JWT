package home.tutorial.security.repository

import home.tutorial.security.model.Role
import home.tutorial.security.model.User
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class UserRepository(
    private val encoder: PasswordEncoder
){
    private val users = mutableSetOf(
        User(
            id = UUID.randomUUID(),
            email = "user@example.com",
            password = "password",
            role = Role.USER,
        ),
        User(
            id = UUID.randomUUID(),
            email = "user2@example.com",
            password = "password2",
            role = Role.ADMIN,
        ),
        User(
            id = UUID.randomUUID(),
            email = "user3@example.com",
            password = "password3",
            role = Role.USER,
        )
    )

    fun save(user: User): Boolean {
        val updated = user.copy(password = encoder.encode(user.password))

        return users.add(updated)

    }


    fun findByEmail(email: String): User? =
        users
            .firstOrNull { it.email == email }

    fun findAll(): Set<User> =
        users

    fun findByUUID(uuid: UUID): User? =
        users.firstOrNull { it.id == uuid }

    fun deleteByUUID(uuid: UUID): Boolean {
        val user = findByUUID(uuid)

        return user?.let {
            users.removeIf {
                it.id == uuid
            }
        } ?: false
    }

}