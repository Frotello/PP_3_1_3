//package ru.kata.spring.boot_security.demo.test;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import ru.kata.spring.boot_security.demo.model.User;
//import ru.kata.spring.boot_security.demo.service.UserService;
//
//
//@Component
//public class MyCommandLineRunner implements CommandLineRunner {
//
//    private final UserService userService;
//
//    public MyCommandLineRunner(UserService userService) {
//        this.userService = userService;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        User adminUser = new User("admin", "admin", 30, "admin@example.com", "admin");
//        User user1 = new User("user1", "user1", 25, "user1@example.com", "user1");
//        User user2 = new User("user2", "user2", 27, "user2@example.com", "user2");
//        User user3 = new User("user3", "user3", 28, "user3@example.com", "user3");
//        User user4 = new User("user4", "user4", 29, "user4@example.com", "user4");
//
//        userService.addUser(adminUser);
//        userService.addUser(user1);
//        userService.addUser(user2);
//        userService.addUser(user3);
//        userService.addUser(user4);
//    }
//}
