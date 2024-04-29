package midterm.luka_mkervalishvili_1.task1;

import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    private String studentName;

    public Fantasy(String studentName) {
        this.studentName = "luka mkervalishvili";
    }

    // Implementation of methods from Dream interface
    public String methodCow3(String argPencil5) {
        return "MethodCow3 implementation";
    }

    public List<String> methodCircuit4(String argLaws6) {
        return List.of("MethodCircuit4 implementation");
    }

    // Implementation of abstract methods from AbstractFantasy
    public String getStrategy1() {
        return "Strategy1 implementation";
    }

    public String getTreatment2() {
        return "Treatment2 implementation";
    }

    // Implementation of toString method
    public String toString() {
        return "Fantasy created by: " + studentName;
    }
}

