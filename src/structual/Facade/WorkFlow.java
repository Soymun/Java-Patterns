package structual.Facade;

public class WorkFlow {
    Developer developer = new Developer();
    BugTracer tracer = new BugTracer();
    Job job = new Job();
    public  void solveProblems(){
        job.doJob();
        tracer.startSprint();
        developer.doJobBeforDeadline(tracer);

        tracer.finishSprint();
        developer.doJobBeforDeadline(tracer);
    }
}
