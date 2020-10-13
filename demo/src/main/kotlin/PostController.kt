package com.example
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/posts")
class PostController() {

    @Autowired
    lateinit var postService: PostService

    @GetMapping("/")
    fun  getAll() = postService.getAll()
}