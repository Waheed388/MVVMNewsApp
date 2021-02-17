package com.waheed.mvvmnewsapp.repository

import com.waheed.mvvmnewsapp.api.RetrofitInstance
import com.waheed.mvvmnewsapp.db.ArticleDatabase
import com.waheed.mvvmnewsapp.model.Article

class NewsRepository(val db: ArticleDatabase) {

    suspend fun getBreakingNews(country: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(country, pageNumber)

    suspend fun searchNews(query: String, pageNumber: Int) =
        RetrofitInstance.api.searchNews(query, pageNumber)


    suspend fun upsertArticle(article: Article) = db.getArticleDao().upsert(article)

    fun getAllArticles() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().delete(article)
}