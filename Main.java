import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;



class Student {
    private String name;
    public String getName() {
        return name;
    }
    private Integer grade;
    public Integer getGrade() {
        return grade;
    }
    private boolean isAnswer=false;
    public boolean isAnswered() {
        return this.isAnswer;
    }
    public void setAnswered(boolean isAnswer) {
        this.isAttend = isAnswer;
    }
    private boolean isAttend=false;
    public void setAttend(boolean isAttend) {
        this.isAttend = isAttend;
    }

    public Student(String name, Integer grade) {
        this.name = name;
        if (grade < 0 || grade > 10) {
            throw new IllegalArgumentException("Upsss, something goes wrong");
        }
        this.grade = grade;
    }

    public void setGrade(Integer grade) {
        if (grade < 0 || grade > 10) {
            throw new IllegalArgumentException("Grade cannot be less than 0 or bigger than 10");
        }
        this.isAttend = true;
        this.isAnswer = true;
        this.grade = grade;
    }
}

public class Main {
    static List<Student> classroom;

    static {
        classroom = new ArrayList<>();

        classroom.add(new Student("Stepashkina Vitaliia", 0));
        classroom.add(new Student("Ponomarev Stepan", 0));
        classroom.add(new Student("Saifut Rafael", 0));
        classroom.add(new Student("Frolova Vika", 0));
        classroom.add(new Student("Ponotrov Ufpan", 0));
        classroom.add(new Student("Saturov Ilia", 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cmd="";
        System.out.println("1. /r – to choose random student");
        System.out.println("2. /l – list of students with grades");
        System.out.println("3. /x – to exit");
        System.out.print("> ");
        while (cmd!="/x") {
            cmd = sc.nextLine();
            switch (cmd) {
                case "/r":
                    randomStudent();
                    break;
                case "/l":
                    for (Student student : classroom.stream().filter(p -> p.getGrade()!=0).toList()) {
                        System.out.printf("%s: %s\n", student.getName(), student.getGrade());
                    }
                    break;
                case "/x":
                    return;
                case "/h":
                    System.out.println("1. /r – to choose random student");
                    System.out.println("2. /l – list of students with grades");
                    System.out.println("3. /x – to exit");
                    break;
                default:
                    System.out.println("command not found.");
                    break;
            }
            System.out.print("> ");
        }
    }

    private static void randomStudent() {
        Scanner sc = new Scanner(System.in);
        List<Student> students = classroom.stream().filter(p -> !p.isAnswered()).toList();
        if (students.isEmpty()) {
            System.out.println("Students ended");
            return;
        }
        Student student = students.get(ThreadLocalRandom.current().nextInt(0, students.size()));
        System.out.format("Is %s here? \n", student.getName());
        System.out.print("> ");
        String ans = sc.nextLine();
        if ("y".equals(ans)) {
            student.setAttend(true);
            student.setAnswered(true);
            System.out.print("Grade: ");
            student.setGrade(sc.nextInt());
        }
    }
}
