package io.github.mwalasiak.onlinebanking.model;

import java.util.Date;

public class Appointment {

    private Integer id;
    private Date date;
    private String location;
    private String description;
    private boolean confirmed;

    private User user;

}
