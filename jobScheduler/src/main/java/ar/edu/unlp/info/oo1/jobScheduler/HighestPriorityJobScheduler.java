package ar.edu.unlp.info.oo1.jobScheduler;

import java.util.Comparator;

public class HighestPriorityJobScheduler extends JobScheduler {
    
    protected JobDescription selectNextJob() {
        return jobs.stream()
                .max(Comparator.comparingInt(JobDescription::getPriority))
                .orElse(null);
    }
}
