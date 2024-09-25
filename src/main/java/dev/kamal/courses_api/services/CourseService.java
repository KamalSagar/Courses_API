package dev.kamal.courses_api.services;

import dev.kamal.courses_api.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getAllCourses();
    public Course getCourse(long courseId);
    public Course addCourse(Course course);
}
