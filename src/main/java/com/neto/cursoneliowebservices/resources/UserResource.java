package com.neto.cursoneliowebservices.resources;

import com.neto.cursoneliowebservices.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        return ResponseEntity.ok(new User(1l, "Maria", "maria@gmail.com", "9999999", "12345"));
    }

}
