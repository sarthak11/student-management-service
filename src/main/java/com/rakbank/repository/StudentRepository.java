package com.rakbank.repository;

import com.rakbank.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Long> {

    StudentEntity findByUniqueId(long uniqueId);

}
