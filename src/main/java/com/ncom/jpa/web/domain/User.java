package com.ncom.jpa.web.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class User implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private LocalDateTime createdDate;

    @Column
    private LocalDateTime updateDate;

    @Builder
    public User(Long id, String name, String phone, String email, LocalDateTime createdDate, LocalDateTime updateDate) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
    }
}
