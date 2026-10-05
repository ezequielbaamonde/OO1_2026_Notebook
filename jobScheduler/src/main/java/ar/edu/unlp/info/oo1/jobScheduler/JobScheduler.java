package ar.edu.unlp.info.oo1.jobScheduler;

import java.util.ArrayList;
import java.util.List;
/*
 Dicha implementación presenta dos serios problemas de diseño:
	- Secuencia de ifs (o sentencia switch/case) para implementar alternativas de un mismo comportamiento.
	- Código duplicado.

*/
public abstract class JobScheduler {
    protected List<JobDescription> jobs;

    public JobScheduler () {
        this.jobs = new ArrayList<>();
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    
    public JobDescription next() {
        JobDescription nextJob = this.selectNextJob();
        this.unschedule(nextJob);
        return nextJob;
    }
    
    protected abstract JobDescription selectNextJob();

}
