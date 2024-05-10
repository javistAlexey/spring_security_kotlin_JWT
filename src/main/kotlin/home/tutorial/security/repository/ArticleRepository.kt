package home.tutorial.security.repository

import home.tutorial.security.model.Article
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class ArticleRepository {
    private val articles = listOf(
        Article(UUID.randomUUID(), title = "Article 1", content = "Content 1"),
        Article(UUID.randomUUID(), title = "Article 2", content = "Content 2"),
    )

    fun findAll(): List<Article> = articles
}