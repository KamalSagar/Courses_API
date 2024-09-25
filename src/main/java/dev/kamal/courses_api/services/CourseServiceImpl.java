package dev.kamal.courses_api.services;

import dev.kamal.courses_api.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> courses;

    public CourseServiceImpl() {
        courses = new ArrayList<Course>();
        courses.add(new Course(145, "Java Core Course", "This course containe basics of java."));
        courses.add(new Course(146, "Spring Boot Course", "Create rest API using spring boot"));
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }

    public Course getCourse(long courseId){
        for(Course course: courses){
            if(course.getId() == courseId){
                return course;
            }
        }
        return null;
    }

    public Course addCourse(Course course){
        courses.add(course);
        return course;
    }
}
