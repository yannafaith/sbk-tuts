package com.example
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
