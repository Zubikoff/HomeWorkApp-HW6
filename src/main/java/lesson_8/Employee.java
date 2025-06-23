package lesson_8;

public class Employee {
    private String fullName, position, email, phone;
    private int salary, age;

    public static void main(String[] args) {
        Employee[] empArr = new Employee[5];

        empArr[0] = new Employee("Ivanov Ivan", "CEO", "iivan@gmail.com", "+375112223344", 3000, 45);
        empArr[1] = new Employee("Vasiliev Vasiliy", "Frontend Dev", "vasvasiliy@gmail.com", "+375113334455", 2000, 46);
        empArr[2] = new Employee("Vert Dider", "Backend Dev", "vedider@gmail.com", "+375113344555", 2200, 31);
        empArr[3] = new Employee("Alisa Alisarova", "QA", "alisarovaalisa@gmail.com", "+375116667788", 1500, 36);
        empArr[4] = new Employee("Evgniy Evgeniev", "HR", "evgenevgen@gmail.com", "+375111235476", 1000, 28);

        for (Employee emp : empArr) {
            if (emp.getAge() > 40) emp.Info();
        }
    }

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        if (salary > 0)
            this.salary = salary;
        if (age > 0)
            this.age = age;
    }

    public void Info() {
        System.out.println("Employee name: " + this.fullName + ". Position: " + this.position + ". Email: " + this.email + ". Phone: " + this.phone + ". Age: " + this.age + ". Salary: " + this.salary);
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(int salary) {
        if (salary > 0)
            this.salary = salary;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }
}
