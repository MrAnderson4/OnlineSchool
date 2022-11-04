package Final;

import com.Online_School.models.*;

import java.sql.SQLOutput;

public class Main {
    public static void main (String[] args)
    {
        Course CourseTest = new Course(1);
        Lectures LecturesTest = new Lectures(1, CourseTest.getID());
        Lectures LecturesTest1 = new Lectures(1, CourseTest.getID());
        Lectures LecturesTest2 = new Lectures(1, CourseTest.getID());
        Lectures LecturesTest3 = new Lectures(1, CourseTest.getID());
        Lectures LecturesTest4 = new Lectures(1, CourseTest.getID());
        Lectures LecturesTest5 = new Lectures(1, CourseTest.getID());
        LecturesTest5.amountLec();








        Lectures result = new Lectures(1, 1);
        Persons teachers = new Persons();
        result.resultC();
        teachers.NameTeachers();
        Students one = new Students("Andrii", "Golub", 18);
        Students two = new Students("Ivanna", "Kuchenko", 19);
        Students three = new Students("Artem", "Shuhevich", 17);
        one.StudentsInfo();
        two.StudentsInfoO();
        three.StudentsInfoO();
        Materials todaysWork = new Materials("Mendeleev Table",
                "Properties of precious metals");
        todaysWork.resultOfClass();
        Persons space = new Persons();
//        ==============================================================================
        space.Space();
        result.resultA();
        teachers.NameTeachersA();
        Students oneA = new Students("Miroslav", "Shevchenko", 19);
        Students twoA = new Students("Sofia", "Miroshnichenko", 18);
        Students threeA = new Students("Taras", "Bondar", 18);
        oneA.StudentsInfo();
        twoA.StudentsInfoO();
        threeA.StudentsInfoO();
        Materials todaysWorkA = new Materials("Basketball match", "30 push-up, 40 squats");
        todaysWorkA.resultOfClass();
        one.amountOfStudents();

    }
}
