package com.session3.example10;

public class User implements Entity<Long> {
    private final Long id;
    private final String name;
    private final String city;

    public User(Long id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', city='" + city + "'}";
    }
}
