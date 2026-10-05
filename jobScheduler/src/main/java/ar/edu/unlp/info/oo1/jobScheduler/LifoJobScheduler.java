package ar.edu.unlp.info.oo1.jobScheduler;

public class LifoJobScheduler extends JobScheduler {
    
    protected JobDescription selectNextJob() {
    	//Hace falta el chequeo explícito, porque uso acceso por índice
    	//Con la lista vacía eso es jobs.get(-1), que lanza IndexOutOfBoundsException
    	//Por eso lo protejo con jobs.isEmpty() ? null : ...
        return jobs.isEmpty() ? null : jobs.get(jobs.size() - 1);
    }
}
