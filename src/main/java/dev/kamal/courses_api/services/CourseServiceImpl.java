package dev.kamal.courses_api.services;

import dev.kamal.courses_api.dao.CourseDao;
import dev.kamal.courses_api.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.apache.catalina.security.SecurityUtil.remove;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

//    List<Course> courses;

    public CourseServiceImpl() {
//        courses = new ArrayList<Course>();
//        courses.add(new Course(145, "Java Core Course", "This course containe basics of java."));
//        courses.add(new Course(146, "Spring Boot Course", "Create rest API using spring boot"));
    }

    @Override
    public List<Course> getAllCourses() {
        return courseDao.findAll();
    }

    public Course getCourse(long courseId){
//        for(Course course: courses){
//            if(course.getId() == courseId){
//                return course;
//            }
//        }
        return courseDao.getOne(courseId);
    }

    public Course addCourse(Course course){
//        courses.add(course);
        courseDao.save(course);
        return course;
    }

    public Course updateCourse(Course course){
//        for(Course c: courses){
//            if(c.getId() == course.getId()) {
//                c.setTitle(course.getTitle());
//                c.setDescription(course.getDescription());
//            }
//        }
        courseDao.save(course);

        return course;
    }

    public void deleteCourse(long courseId) {
//        courses = this.courses.stream()
//                                .filter(course->course.getId()!=courseId)
//                                .collect(Collectors.toList());
        Course entity = courseDao.getOne(courseId);
        courseDao.delete(entity);
    }
}
