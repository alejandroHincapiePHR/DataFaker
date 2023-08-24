package com.DBFaker.DataFaker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.DBFaker.DataFaker.Domain.Student;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
