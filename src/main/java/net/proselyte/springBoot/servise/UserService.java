package net.proselyte.springBoot.servise;

import net.proselyte.springBoot.model.User;

import java.util.List;

public interface UserService {
    public User getById(Integer id);
    public List<User> getAll();
    public User saveUser(User user);
    public void deleteById(Integer id);


}
