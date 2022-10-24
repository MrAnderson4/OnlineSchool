package Final;

import com.Online_School.Lectures;
import com.Online_School.Materials;
import com.Online_School.Persons;
import com.Online_School.Students;

public class Main {
    public static void main (String[] args)
    {
        Lectures result = new Lectures();
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
        one.AmountOFStudents();
    }
}
