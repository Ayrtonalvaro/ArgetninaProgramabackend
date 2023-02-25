package com.backendPorfolio.Ayrton.Controller;

import com.backendPorfolio.Ayrton.Entity.User;
import com.backendPorfolio.Ayrton.Services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long id ) {
        User user = userService.findUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User addUser = userService.addUser(user);
        return new ResponseEntity<>(addUser, HttpStatus.OK);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<User> editUser(@RequestBody User user, @PathVariable Long id){
        User editUser = userService.editUser(user, id);
        return new ResponseEntity<>(editUser, HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return  new ResponseEntity<>("Usuario eliminado correcatamente", HttpStatus.OK);
    }

}
