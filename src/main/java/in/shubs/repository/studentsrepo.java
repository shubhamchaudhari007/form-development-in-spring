package in.shubs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shubs.entity.students;

public interface studentsrepo extends JpaRepository<students, Integer> {

}
