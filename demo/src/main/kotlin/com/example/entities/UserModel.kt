package com.example.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity class User(
        @Id @GeneratedValue
        var id: Int = 0,
        var username: String,
        var password: String,
        var firstname: String,
        var lastname: String,
        var email: String,
        var phone: String
)