package dev.kamal.courses_api.dao;

import dev.kamal.courses_api.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


public interface CourseDao extends JpaRepository<Course, Long> {

//    Course save(Course course);
//    List<Course> findAll();
//    Course getOne(Long id);

}
