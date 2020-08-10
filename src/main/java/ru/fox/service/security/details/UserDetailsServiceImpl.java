package ru.fox.service.security.details;

import jdk.nashorn.internal.ir.Optimistic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.fox.service.models.User;
import ru.fox.service.repositories.UsersReposytory;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UsersReposytory usersReposytory;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Optional<User> userCandidate = usersReposytory.findByLogin(login);
        if (userCandidate.isPresent()) {
            return new UserDetailsImpl(userCandidate.get());
        }
        else throw new IllegalArgumentException("User not found");



    }
}
