package com.asange.demo.controller;

import com.asange.demo.model.User;
import com.asange.demo.repository.UserRepository;
import com.asange.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    /**
     * 查询所有用户
     *
     * @return
     */
    @GetMapping("/users")
    public List<User> users() {
        return userRepository.findAll();
    }

    /**
     * 增加
     *
     * @param name
     * @param age
     * @return
     */
    @PostMapping("/user/add")
    public User userAdd(@RequestParam("name") String name, @RequestParam("age") int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return userRepository.save(user);
    }

    /**
     * 删除
     *
     * @param id
     */
    @DeleteMapping("/user/del/{id}")
    public void userDel(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }

    /**
     * 更新
     *
     * @param id
     * @return
     */
    @PutMapping("user/update")
    public User userUpdate(@RequestParam("id") Integer id) {
        User one = userRepository.getOne(id);
        one.setAge(one.getAge() + 1);
        return userRepository.save(one);
    }


    @PostMapping("user/add2")
    public void save2user() {
        userService.save2user();
    }

}
