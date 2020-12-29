package com.ncom.jpa.web.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class User{

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 10, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String email;

    private String address;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date latest_login_at;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private List<UserRole> userRole;

}
