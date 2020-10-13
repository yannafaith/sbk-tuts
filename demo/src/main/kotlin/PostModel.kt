package com.example

import javax.persistence.Entity
import javax.persistence.GeneratedValue
//import javax.persistence.ManyToOne
import javax.persistence.Id


@Entity
class Post(
        @Id
        @GeneratedValue
        var id: Int = 1,
        var title: String = "Test",
        var body: String = "I'm the man",
        var likes: Int = 5
//        var creator_id: Long
//        @ManyToOne var author: User
)

//@Entity
//data class User(
//        @Id
//        @GeneratedValue
//        var id: Int,
//        var username: String,
//        var password: String,
//        var firstname: String,
//        var lastname: String,
//        var email: String,
//        var phone: String
//)

