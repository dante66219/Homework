package task2.buildings;

public class validation {

    private int residentialCheck;

    public validation(int residentialCheck) {
        this.residentialCheck = residentialCheck;
    }

    public boolean isValid () {
        if (residentialCheck == 1)
            return true;
        return false;

    }

}
