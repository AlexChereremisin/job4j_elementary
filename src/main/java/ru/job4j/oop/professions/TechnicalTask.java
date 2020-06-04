package ru.job4j.oop.professions;

import java.util.Date;

public class TechnicalTask {
    private Date deadline;

    public TechnicalTask(Date deadline) {
        this.deadline = deadline;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
