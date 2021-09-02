package duplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    List<Course> allCourses = Arrays.asList(new Course(7, 8), new Course(10, 11), new Course(14, 15));
    List<Course> coursesBooked = new ArrayList<>();

    public Course bookCourse(int start, int end) {
        for (Course course : allCourses) {
            if (course.start == start && course.end == end) {
                coursesBooked.add(course);
                return course;
            }
        }
        return null;
    }

    public void deleteCourses(int start, int end) {
        for (Course course : coursesBooked) {
            if (course.start == start && course.end == end) {
                coursesBooked.remove(new Course(start, end));
                return;
            }
        }
    }

    public List<Course> coursesBooked() {
        return coursesBooked;
    }
}
