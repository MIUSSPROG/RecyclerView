package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.model.UserService
import com.example.recyclerview.model.UsersListener

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: UsersAdapter
    private lateinit var service: UserService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        service = UserService()
        adapter = UsersAdapter(service.getUsers())
        binding.rvUsers.adapter = adapter
    }

//    private val usersListener: UsersListener = {
//        adapter.users = it
//    }
}