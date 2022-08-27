package com.example.demo.base;

import javax.persistence.*;
import java.util.Date;

public abstract class BaseEntity {

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
