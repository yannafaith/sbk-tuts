package com.example.services

import com.example.entities.User
import org.springframework.stereotype.Repository

@Repository
interface UserService {
    fun getAll(): List<User>
    fun getUserById(id: Int): User
    fun addUser(user: User): User
    fun updateUser(id: Int, user: User): User
    fun deleteUser(id: Int)
}