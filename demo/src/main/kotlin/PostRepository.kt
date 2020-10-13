package com.example
import org.springframework.stereotype.Repository

@Repository
class PostRepository()
{
    fun getAll(): List<Post> {
        return listOf(
                Post(),
                Post()
        )
    }
}


