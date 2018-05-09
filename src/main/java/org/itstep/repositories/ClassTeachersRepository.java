package org.itstep.repositories;

import org.itstep.entities.ClassTeachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassTeachersRepository extends JpaRepository<ClassTeachers, Integer>{
}
