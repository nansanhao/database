package com.example.database.entity;

import java.util.Date;

public class CloseContact {
    private Integer id;
    private Integer pId;
    private Date datetime;
    private Integer locId;
    private Integer casePId;

    public Integer getId() {
        return id;
    }

    public Integer getpId() {
        return pId;
    }

    public Date getDate() {
        return datetime;
    }

    public Integer getLocId() {
        return locId;
    }

    public Integer getCasePId() {
        return casePId;
    }
}
