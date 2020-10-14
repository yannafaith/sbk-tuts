package com.example.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.ManyToOne
import javax.persistence.Id


@Entity
class Post(
        @Id @GeneratedValue
        var id: Long = 0,
        var title: String = "Test",
        var body: String = "I'm the man",
        var likes: Int = 5
//        @ManyToOne var author: User
)



