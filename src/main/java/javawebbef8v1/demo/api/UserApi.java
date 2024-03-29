package javawebbef8v1.demo.api;

import javawebbef8v1.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserApi {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUser")
    public ResponseEntity<?> doGetAllUser() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

}
