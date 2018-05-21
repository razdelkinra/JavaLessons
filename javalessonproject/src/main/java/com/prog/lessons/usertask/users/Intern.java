package com.prog.lessons.usertask.users;

import javax.annotation.Nonnull;

/**
 * Стажер
 */
public class Intern {

    @Nonnull
    String faculty;

    @Nonnull
    String universitetName;

    @Nonnull
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(@Nonnull String faculty) {
        this.faculty = faculty;
    }

    @Nonnull
    public String getUniversitetName() {
        return universitetName;
    }

    public void setUniversitetName(@Nonnull String universitetName) {
        this.universitetName = universitetName;
    }
}
