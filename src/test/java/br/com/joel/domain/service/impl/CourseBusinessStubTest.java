package br.com.joel.domain.service.impl;

import br.com.joel.domain.service.CourseService;
import br.com.joel.service.stubs.CourseServiceStubs;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class CourseBusinessStubTest {

    @Test
    void testCourseRelatedToSprin_When_UsingAStub() {

        CourseService courseServiceStubs = new CourseServiceStubs();
        CourseBusiness courseBusiness = new CourseBusiness(courseServiceStubs);

        List<String> stringList = courseBusiness.retrieveCoursesRelatedToSpring("Joel");

        assertEquals(4, stringList.size());
    }

    @Test
    void testCourseRelatedToSprin_When_UsingAMacielStudent() {

        CourseService courseServiceStubs = new CourseServiceStubs();
        CourseBusiness courseBusiness = new CourseBusiness(courseServiceStubs);

        List<String> stringList = courseBusiness.retrieveCoursesRelatedToSpring("Maciel");

        assertEquals(0, stringList.size());
    }

}