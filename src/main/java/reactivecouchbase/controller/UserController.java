package reactivecouchbase.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactivecouchbase.model.User;
import reactivecouchbase.service.UserService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;
    public UserController(final UserService userService){
        this.userService = userService;
    }
    @PostMapping("")
   public Mono<User> create(@RequestBody User user){
       return userService.create(user);
   }
}
