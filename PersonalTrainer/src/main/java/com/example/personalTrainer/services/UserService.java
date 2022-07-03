package com.example.personalTrainer.services;

import com.example.personalTrainer.models.User;
import com.example.personalTrainer.models.enums.Role;
import com.example.personalTrainer.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private  UserRepository userRepository;
    @Autowired
    private  PasswordEncoder passwordEncoder;

    public User findById(Long id) {
        return userRepository.getReferenceById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public boolean createUser(User user) {
        if (userRepository.findByName(user.getName()) != null) return false;
        user.setActive(true);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.getRoles().add(Role.ROLE_USER);
        userRepository.save(user);
        return true;
    }

//    public boolean createUser(User user) throws UserAlreadyExistException {
//        if (userRepository.findByName(user.getName()) != null) {
//            throw new UserAlreadyExistException("User already exist!");
//
//        }
//        user.setActive(true);
//        user.getRoles().add(Role.ROLE_USER);
//        userRepository.save(user);
//        return true;
//    }
}


//    public UserEntity registration (UserEntity userEntity) throws UserAlreadyExistException {
//        if(userRepository.findByUsername(userEntity.getUserName()) != null) {
//            throw  new UserAlreadyExistException("Пользователь с таким именем существует");
//        }
//        return userRepository.save(userEntity);
//    }

