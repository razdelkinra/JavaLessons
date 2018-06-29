package usertask.data;



import com.prog.lessons.usertask.users.Manager;
import com.prog.lessons.usertask.users.ServiceWorker;

import java.util.ArrayList;
import java.util.List;

/**
 * Место хранения юзеров. Потом будем использовать БД
 */
public class Storage {
    private List<Manager> managers = new ArrayList<>();
    private List<ServiceWorker> serviceWorkers = new ArrayList<>();

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    public List<ServiceWorker> getServiceWorkers() {
        return serviceWorkers;
    }

    public void setServiceWorkers(List<ServiceWorker> serviceWorkers) {
        this.serviceWorkers = serviceWorkers;
    }
}
