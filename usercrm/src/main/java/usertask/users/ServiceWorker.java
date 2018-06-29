package usertask.users;

import com.prog.lessons.usertask.enums.ServiceSpeciality;

/**
 * Сервисник
 */
public class ServiceWorker {

    private ServiceSpeciality speciality;

    public ServiceSpeciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(ServiceSpeciality speciality) {
        this.speciality = speciality;
    }
}
