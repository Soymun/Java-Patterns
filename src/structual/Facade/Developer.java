package structual.Facade;

public class Developer {
    public  void  doJobBeforDeadline(BugTracer tracer){
        if(tracer.isActiveSprint()){
            System.out.println("Developer solving problem...");
        }else {
            System.out.println("Developer finish problem.");
        }
    }
}
