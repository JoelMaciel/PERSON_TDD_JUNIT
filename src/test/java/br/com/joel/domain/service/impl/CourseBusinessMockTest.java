package br.com.joel.domain.service.impl;

import br.com.joel.domain.service.CourseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CourseBusinessMockTest {
    CourseService courseServiceMock;
    CourseBusiness courseBusiness;
    List<String> courses;

    @BeforeEach
    void init() {
        courseServiceMock = mock(CourseService.class);
        courseBusiness = new CourseBusiness(courseServiceMock);
        courses = Arrays.asList(
                "REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker",
                "Agile Desmistificado com Scrum, XP, Kanban e Trello",
                "Spotify Engineering Culture Desmistificado",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker",
                "Docker do Zero à Maestria - Contêinerização Desmistificada",
                "Docker para Amazon AWS Implante Apps Java e .NET com Travis CI",
                "Microsserviços do 0 com Spring Cloud, Spring Boot e Docker",
                "Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Kotlin e Docker",
                "Kotlin para DEV's Java: Aprenda a Linguagem Padrão do Android",
                "Microsserviços do 0 com Spring Cloud, Kotlin e Docker"
        );
    }

    @Test
    void testCourseRelatedToSprin_When_UsingAMock() {
        when(courseServiceMock.retrieveCourse("Joel")).thenReturn(courses);

        assertEquals(11, courses.size());
    }

}