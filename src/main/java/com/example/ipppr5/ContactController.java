package com.example.ipppr5;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contacts")
@RequiredArgsConstructor
public class ContactController {
    private final ContactRepository contactRepository;

    @GetMapping("all")
    public List<Contact> getAll() {
        return contactRepository.getAll();
    }

    @GetMapping()
    public Contact get(String name) {
        return contactRepository.get(name);
    }

    @PostMapping()
    public Contact post(@RequestBody Contact contact) {
        return contactRepository.add(contact);
    }

    @PutMapping()
    public Contact put(@RequestBody Contact contact) {
        return contactRepository.add(contact);
    }

    @DeleteMapping()
    public Contact delete(String name) {
        return contactRepository.delete(name);
    }
}
