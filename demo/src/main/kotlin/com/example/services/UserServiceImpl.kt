package com.example.services
import com.example.entities.User

import org.springframework.stereotype.Service

@Service
class UserServiceImpl: UserService {
    override fun getAll(): List<User> {
        return listOf(
                User(email = "g", password = "f", lastname = "s", username = "d", phone = "34", firstname = "S"),
                User(email = "g", password = "f", lastname = "s", username = "d", phone = "34", firstname = "s")
        )
    }

    override fun getUserById(id: Int): User {
        return User(email = "g", password = "f", lastname = "s", username = "d", phone = "34", firstname = "S")
    }

    override fun addUser(user: User): User {
        TODO("Not yet implemented")
    }

    override fun updateUser(id: Int, user: User): User {
        TODO("Not yet implemented")
    }

    override fun deleteUser(id: Int) {
        TODO("Not yet implemented")
    }
}
