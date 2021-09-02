package duplication;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class StudentTest {
    @Test
    public void should_return_course_when_time_is_matched() {
        assertThat(new Student().bookCourse(14, 15), is(new Course(14, 15)));
    }

    @Test
    public void should_remove_course_from_courses_booked() {
        Student student = new Student();
        student.bookCourse(7, 8);
        student.bookCourse(14, 15);

        student.deleteCourses(14, 15);

        assertThat(student.coursesBooked(), is(Arrays.asList(new Course(7, 8))));
    }
}