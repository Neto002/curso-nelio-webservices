package com.neto.cursoneliowebservices.services;

import com.neto.cursoneliowebservices.entities.User;
import com.neto.cursoneliowebservices.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public User findById(Long id) {
        return this.userRepository.findById(id).get();
    }

    public User insert(User user) {
        return this.userRepository.save(user);
    }

    public void delete(Long id) {
        this.userRepository.deleteById(id);
    }

    public User update(Long id, User user) {
        // Para esse caso, é melhor usar o getReferenceById ao invés do findById,
        // visto que o primeiro método só traz a referência para ser gerenciada pelo JPA
        User entity = this.userRepository.getReferenceById(id);
        updateData(entity, user);
        return this.userRepository.save(entity);
    }

    private void updateData(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }
}
