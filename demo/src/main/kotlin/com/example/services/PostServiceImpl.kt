package com.example.services
import com.example.entities.Post

import org.springframework.stereotype.Service

@Service
class PostServiceImpl: PostService {
    override fun getAll(): List<Post> {
        return listOf(
                Post(),
                Post()
        )
    }
}
