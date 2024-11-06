package com.transport.transport.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/users")
    public String getHello() {
        return "Harys";
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public String getUser(@PathVariable int id) {
        // Logic to retrieve user with the given ID
        return "User ID: " + id;
    }

//    @PostMapping("/user")
//    @ResponseBody
//    public String createUser(@RequestBody User user) {
//        // Logic to create a new user
//        return "User created: " + user.getName();
//    }


//    @PutMapping("/user/{id}")
//    @ResponseBody
//    public String updateUser(@PathVariable int id, @RequestBody User user) {
//        // Logic to update user with the given ID
//        return "User updated: " + user.getName();
//    }
//
//    @DeleteMapping("/user/{id}")
//    @ResponseBody
//    public String deleteUser(@PathVariable int id) {
//        // Logic to delete user with the given ID
//        return "User deleted: " + id;
//    }

}
