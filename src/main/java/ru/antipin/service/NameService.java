package ru.antipin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.antipin.entity.Name;
import ru.antipin.repository.NameRepository;

import java.util.List;

@Service
public class NameService {

    @Autowired
    private NameRepository nameRepository;

    public List<Name> findAll() {
        return nameRepository.findAll();
    }

    public void save(Name name) {
        nameRepository.save(name);
    }

    public void delete(Name name) {
        nameRepository.delete(name);
    }

    public void deleteById(Long id) {
        nameRepository.deleteById(id);
    }
}
