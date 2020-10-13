package com.example
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/posts")
class PostController(val repository: PostRepository) {
    @GetMapping("/")
    fun  getAll() = repository.getAll()
}