package com.asange.demo.service;

import com.asange.demo.model.User;
import com.asange.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    /**
     * 使用事务执行两个数据插入(两个数据作为一个单元)
     */
    @Transactional
    public void save2user() {
        User user = new User();
        user.setName("张三34");
        user.setAge(34);
        userRepository.save(user);

        User user2 = new User();
        user2.setName("李四xxx8734787fudfdgghdfggfdgydey8owrfogywrgyugoyuweyyugywugy");
        user2.setAge(23);
        userRepository.save(user2);
    }
}
