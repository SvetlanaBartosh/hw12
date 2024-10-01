package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {
    @Test
    public void simpleTaskMatchesTest (){
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = false;
        boolean actual = simpleTask.matches("Завтрак");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void simpleTaskMatchesTest2 (){
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void epicMatchesTest (){
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Молоко");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void epicMatchesTest2 (){
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("Яблоки");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void meetingMatchesTest (){
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("3");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void meetingMatchesTest2 (){
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Приложение");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void meetingMatchesTest3 (){
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = meeting.matches("Обед");
        Assertions.assertEquals(expected,actual);
    }
}
