package com.ncom.jpa.web.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Data
public class UserRole {

    @Id
    private String role_id;

    private String user_id;

    private String role;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date authorized_at;
}
