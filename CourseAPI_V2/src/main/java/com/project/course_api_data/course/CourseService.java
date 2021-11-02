package com.project.course_api_data.course;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getAllCourses(String id){

        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);

        return courses;

    }

    public Course getCourse(String id){

        return courseRepository.findById(id).get();
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

    }


    public void addCourse(Course course){

        courseRepository.save(course);
        //topics.add(course);

    }


    public void updateCourse(String id, Course course){

        courseRepository.save(course);
    }


    public void deleteCourse(String id){

        courseRepository.deleteById(id);

    }




}
