import models.*;
import services.*;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
//        TestService testService = new TestService();
//        TestListService testListService = new TestListService();
//        StudentAnswer studentAnswer = new StudentAnswer();
//        RoleService roleService = new RoleService();
//        GroupService groupService = new GroupService();
//        QuestionService questionService = new QuestionService();
        AnswerService answerService = new AnswerService();

//        Answer answer1 = new Answer("Ответ 1", true);
//        Answer answer2 = new Answer("Ответ 2", false);
//        Answer answer3 = new Answer("Ответ 3", true);
//        Answer answer4 = new Answer("Ответ 4", true);
//        Answer answer5 = new Answer("Ответ 5", false);
//
//        answerService.saveAnswer(answer1);
//        answerService.saveAnswer(answer2);
//        answerService.saveAnswer(answer3);
//        answerService.saveAnswer(answer4);
//        answerService.saveAnswer(answer5);


        Role student = new Role("Student");
        Role teacher = new Role("Teacher");

        User user1 = new User("David", "Adzhamyan", "Yurievich", "davadzh", "123");
        user1.setRole(student);

        User user2 = new User("Иванов", "Иван", "Иванович", "ivan", "123");
        user2.setRole(student);

        User user3 = new User("Петров", "Петр", "Иванович", "petroff", "1234");
        user3.setRole(student);


        User teacher1 = new User("Милованов", "Даниил", "Михайлович", "miovanov", "123");
        teacher1.setRole(teacher);

        User teacher2 = new User("Коротеев", "Коротей", "Иванович", "mvkoroteev", "123");
        teacher2.setRole(teacher);


//        userService.saveUser(user1);
//        userService.saveUser(user2);
//        userService.saveUser(user3);
//        userService.saveUser(teacher1);
//        userService.saveUser(teacher2);


//        TestList test1 = new TestList("Алгебра");
//        TestList test2 = new TestList("Питон");
//
//        testListService.saveTestList(test1);
//        testListService.saveTestList(test2);
//
//
//        Question question1 = new Question("Вопрос 1", 2, true);
//        Question question2 = new Question("Вопрос 2", 2, true);
//        Question question3 = new Question("Вопрос 3", 2, true);
//
//        questionService.saveQuestion(question1);
//        questionService.saveQuestion(question2);
//        questionService.saveQuestion(question3);
//
//

//



        //StudentAnswer studentAnswer1 = new StudentAnswer();

        System.out.println(userService.getTeachers());
        System.out.println(userService.getStudents());
    }
}
