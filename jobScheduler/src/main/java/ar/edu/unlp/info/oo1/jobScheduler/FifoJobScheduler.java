package ar.edu.unlp.info.oo1.jobScheduler;

public class FifoJobScheduler extends JobScheduler {
 
    protected JobDescription selectNextJob() {
        return jobs.stream()
        		.findFirst()
        		.orElse(null);
    }
}
