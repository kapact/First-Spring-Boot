package com.akshaw.firstspring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class Account(
    val id: Int,
    val name: String
)

@RestController
@RequestMapping("/accounts")
class HelloController {

    @GetMapping("")
    fun hello() = listOf(Account(1, "Akshay"), Account(2, "Amit bhardwaj"))

}