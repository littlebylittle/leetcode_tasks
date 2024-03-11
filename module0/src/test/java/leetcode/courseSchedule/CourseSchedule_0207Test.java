package leetcode.courseSchedule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseSchedule_0207Test {
    @Test
    void name() {
        boolean b = new CourseSchedule_0207().canFinish(5, new int[][]{{0, 1}, {0, 2}, {1, 2}, {3, 4}});
        assertTrue(b);
    }
}