package com.baosian.services;

import com.baosian.entity.User;
import com.baosian.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    //@Override
    public User addUser(User user) {
        return userRepository.saveAndFlush(user);
    }

   // @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    //@Override
    public User editUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    //@Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean saveUser(User user){
        try{
            userRepository.save(user);
            return true;
        }catch (Exception ex){
            return false;
        }

    }
}
