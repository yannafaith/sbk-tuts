package com.example.services
import com.example.entities.Post
import org.springframework.stereotype.Repository

@Repository
interface PostService {
    fun getAll(): List<Post>
}



