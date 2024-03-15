package com.process.shop.service;

import com.process.shop.model.Address;
import com.process.shop.model.User;
import com.process.shop.model.enums.DocumenType;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User userUpdate, Long id) {
        return null;
    }

    @Override
    public User gerUserById(Long id) {
        return User.builder()
                .fullName("pepito perez")
                .document("123")
                .documentType(DocumenType.CC)
                .address(List.of(
                        Address.builder()
                                .avenue("1212")
                                .neighborhood("12131")
                                .build(),
                        Address.builder()
                                .avenue("calle21A")
                                .neighborhood("57-10")
                                .build()))
                .build(); }

    @Override
    public List<User> findAllUsers() {
        return null;
    }
}
