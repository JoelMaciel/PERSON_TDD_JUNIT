package br.com.joel.domain.service.impl;

import br.com.joel.domain.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseBusiness {

    private CourseService courseService;

    public CourseBusiness(CourseService courseService) {
        this.courseService = courseService;
    }

    public List<String> retrieveCoursesRelatedToSpring(String student) {
        ArrayList<String> filteredCourses = new ArrayList<>();
        if ("Maciel".equals(student)) return filteredCourses;

        List<String> allCourses = courseService.retrieveCourse(student);

        for (String course : allCourses) {
            if (course.contains("Spring")) {
                filteredCourses.add(course);
            }
        }
        ;
        return filteredCourses;
    }


}
