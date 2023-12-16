package com.example.ipppr5;

import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Getter
public class ContactRepository {
    private final Map<String, Contact> contacts = new HashMap<>();

    public List<Contact> getAll() {
        return new ArrayList<>(contacts.values());
    }

    public Contact get(String name) {
        return contacts.getOrDefault(name, null);
    }

    public Contact add(Contact contact) {
        contacts.put(contact.getName(), contact);
        return get(contact.getName());
    }

    public Contact delete(String name) {
        Contact oldContact = get(name);

        if (name == null) {
            return null;
        }

        contacts.remove(name);

        return oldContact;
    }
}
