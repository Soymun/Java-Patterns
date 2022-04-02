package structual.bridge;

public class ProgramCreate {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new CppDeveloper())
        };
        for(Program p : programs){
            p.developProgram();
        }
    }
}
