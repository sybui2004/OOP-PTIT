import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private final String studentId;
    private final String fullName;
    private final List<Subject> subjects;

    public Student(String studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.subjects = new ArrayList<>();
    }
    public String getStudentId() {
        return studentId;
    }
    public String getFullName() {
        return fullName;
    }
    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
    public List<Subject> getSubjects() {
        return subjects;
    }
}

class Subject {
    private final String subjectName;
    private final int credits;

    public Subject(String subjectName, int credits) {
        this.subjectName = subjectName;
        this.credits = credits;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getCredits() {
        return credits;
    }
}

class Invoice {
    private final Student student;
    private final double totalTuition;
    private final String decisionId;

    public Invoice(Student student, double totalTuition, String decisionId) {
        this.student = student;
        this.totalTuition = totalTuition;
        this.decisionId = decisionId;
    }
    public Student getStudent() {
        return student;
    }
    public double getTotalTuition() {
        return totalTuition;
    }
    public String getDecisionId() {
        return decisionId;
    }
}

class PaymentController {
    public Invoice getInvoice() {
        Scanner scanner = new Scanner(System.in);
        String studentId = scanner.nextLine();
        String fullName = scanner.nextLine();
        Student student = new Student(studentId, fullName);
        int numSubjects = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numSubjects; i++) {
            String subjectId = scanner.nextLine();
            String subjectName = scanner.nextLine();
            int credits = Integer.parseInt(scanner.nextLine());
            student.addSubject(new Subject(subjectName, credits));
        }

        String decisionId = scanner.nextLine();
        scanner.nextLine();
        double tuitionPerCredit = Double.parseDouble(scanner.nextLine());
        double totalTuition = 0;

        for (Subject subject : student.getSubjects()) {
            totalTuition += subject.getCredits() * tuitionPerCredit;
        }

        return new Invoice(student, totalTuition, decisionId);
    }
}

class InvoiceView {
    public static void show(Invoice invoice) {
        System.out.println("Mã sinh viên: " + invoice.getStudent().getStudentId());
        System.out.println("Họ tên: " + invoice.getStudent().getFullName());
        System.out.println("Các môn học:");

        for (Subject subject : invoice.getStudent().getSubjects()) {
            System.out.println(subject.getSubjectName());
        }

        System.out.println("Học phí phải nộp là: " + invoice.getTotalTuition());
        System.out.println("Theo QĐ: " + invoice.getDecisionId());
    }
}

public class HELLOJAR {
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        // Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}
