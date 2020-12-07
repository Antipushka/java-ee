package ru.antipin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.antipin.entity.Name;
import ru.antipin.repository.NameRepository;

import java.util.List;

@Service
public class NameServiceImpl implements NameService {

    @Autowired
    private NameRepository nameRepository;

    @Override
    public List<Name> findAll() {
        return nameRepository.findAll();
    }

    @Override
    public void save(Name name) {
        nameRepository.save(name);
    }

    @Override
    public void delete(Name name) {
        nameRepository.delete(name);
    }

    @Override
    public void deleteById(Long id) {
        nameRepository.deleteById(id);
    }
}
