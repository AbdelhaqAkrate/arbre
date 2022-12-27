package com.example.skillstree.Controllers;

import com.example.skillstree.ApiConstant.UserRestUriConstants;
import com.example.skillstree.Services.UserServices;
import com.example.skillstree.entities.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("/users")
public class UserController {
    UserServices userServices = new UserServices();

    @GetMapping(value = UserRestUriConstants.GET_ALL_USERS, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<User> getAllUsers() {
        List<User> users = userServices.getAllUsers();
        if (users.isEmpty()) {
            return null;
        }
        return users;
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody int getUser(@PathVariable int id) {
//        return userServices.findUser(id);
        return id;
    }

    @PostMapping(value = UserRestUriConstants.CREATE_USER, consumes = MediaType.ALL_VALUE, produces = MediaType.ALL_VALUE)
    public @ResponseBody String createUser(@RequestBody User user) {
        userServices.newUser(user);
        return "User Created Successful !!";
    }

    @PostMapping(value = UserRestUriConstants.LOGIN, consumes = {"application/json"}, produces = {"application/json"})
    public @ResponseBody String login(String email, String password) {
        userServices.login(email, password);
        return "welcome";
    }
}
