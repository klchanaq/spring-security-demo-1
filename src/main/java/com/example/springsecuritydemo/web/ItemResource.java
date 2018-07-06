package com.example.springsecuritydemo.web;

import com.example.springsecuritydemo.domain.Item;
import com.example.springsecuritydemo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

@RestController
@RequestMapping("/api")
public class ItemResource {

    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping("/testItemResource")
    public String test() {
        return "ItemResource!";
    }

    @RequestMapping("/items")
    public List<Item> getAllItems() {
        // this will return HttpStatus 200 or 500 internal server error if exception
        // throw new RuntimeException();
        return itemRepository.findAll();
    }

    @RequestMapping("/items/{id}")
    public Optional<Item> getItem(@PathVariable Long id) {
        return itemRepository.findById(id);
    }

    @RequestMapping("/ResponseEntityItems/{id}")
    public ResponseEntity<Item> getItemWithResponseEntity(@PathVariable Long id) {
        return itemRepository.findById(id)
                .map(item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
