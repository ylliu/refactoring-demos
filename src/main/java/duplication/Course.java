package duplication;

import java.util.Objects;

public class Course {

    public int start;
    public int end;

    public Course(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return start == course.start && end == course.end;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }
}
