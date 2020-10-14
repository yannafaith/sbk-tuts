package com.example.controllers

import com.example.entities.User
import com.example.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UserController {
    @Autowired
    lateinit var userService: UserService

    @GetMapping("/")
    fun getAll() = userService.getAll()

    @GetMapping("/users")
    fun getUserById(@RequestParam(value = "id") id: Int) =
            userService.getUserById(id)


    @PostMapping("/users")
    fun addUser(@RequestBody user: User) =
            userService.addUser(user)


    @PutMapping("/users")
    fun updateUser(@RequestParam(value = "id") id: Int, @RequestBody user: User) =
            userService.updateUser(id, user)


    @DeleteMapping("/users")
    fun deleteUser(@RequestParam(value = "id") id: Int) =
            userService.deleteUser(id)

}