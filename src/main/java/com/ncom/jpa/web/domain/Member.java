package com.ncom.jpa.web.domain;

import lombok.*;

import javax.persistence.*;


@Data                   //lombok
@NoArgsConstructor      //lombok
@AllArgsConstructor     //lombok
@Entity
@Table(name = "MEMBER")
public class Member {
    @Id
    @Column(name = "MEMBER_ID")
    private String id;

    @Column(name = "MEMBER_NAME")
    private String name;
    private int age;
    private String address;

    @OneToOne
    @JoinTable(name = "MEMBER_TEACHER", //조인테이블명
            joinColumns = @JoinColumn(name="MEMBER_ID"),  //외래키
            inverseJoinColumns = @JoinColumn(name="TEACHER_ID") //반대 엔티티의 외래키
    )
    private Teacher teacher;

    public Member(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
        //teacher.addMember(this); //Teacher의 멤버 등록
    }
}