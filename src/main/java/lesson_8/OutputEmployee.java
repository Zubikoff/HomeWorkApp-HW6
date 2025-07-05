package lesson_8;

public class OutputEmployee {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[5];

        empArr[0] = new Employee("Ivanov Ivan", "CEO", "iivan@gmail.com", "+375112223344", 3000, 45);
        empArr[1] = new Employee("Vasiliev Vasiliy", "Frontend Dev", "vasvasiliy@gmail.com", "+375113334455", 2000, 46);
        empArr[2] = new Employee("Vert Dider", "Backend Dev", "vedider@gmail.com", "+375113344555", 2200, 31);
        empArr[3] = new Employee("Alisa Alisarova", "QA", "alisarovaalisa@gmail.com", "+375116667788", 1500, 36);
        empArr[4] = new Employee("Evgniy Evgeniev", "HR", "evgenevgen@gmail.com", "+375111235476", 1000, 28);

        for (Employee emp : empArr) {
            if (emp.getAge() > 40) emp.info();
        }
    }
}
