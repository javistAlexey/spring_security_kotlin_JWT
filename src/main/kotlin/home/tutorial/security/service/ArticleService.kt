package home.tutorial.security.service

import home.tutorial.security.model.Article
import home.tutorial.security.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService(
    val articleRepository: ArticleRepository
) {

    fun findAll(): List<Article> = articleRepository.findAll()
}