package ru.antipin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.antipin.entity.Name;

@Repository
public interface NameRepository extends JpaRepository<Name, Long> {
}
