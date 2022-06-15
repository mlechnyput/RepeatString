package com.company;

import java.util.Objects;

public class Second {
    String login;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Second)) return false;
        Second second = (Second) o;
        return Objects.equals(login, second.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }
}
