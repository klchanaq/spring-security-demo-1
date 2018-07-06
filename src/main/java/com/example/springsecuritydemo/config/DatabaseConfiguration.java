package com.example.springsecuritydemo.config;

import com.example.springsecuritydemo.domain.Item;
import com.example.springsecuritydemo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableJpaRepositories("com.example.springsecuritydemo.repository")
@EnableTransactionManagement
public class DatabaseConfiguration {

    @Autowired
    private ItemRepository itemRepository;

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            int i = 1;
            for (; i <= 10; i++) {
                itemRepository.save(new Item("item " + i));
            }
        };
    }

}
