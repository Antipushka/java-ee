package ru.antipin.service;

import ru.antipin.entity.Name;

import java.util.List;

public interface NameService {

    List<Name> findAll();

    void save(Name name);

    void delete(Name name);

    void deleteById(Long id);
}
