package com.ncom.jpa.web.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Data                   //lombok
@NoArgsConstructor      //lombok
@Entity
public class Teacher {
    @Id
    @Column(name = "TEACHER_ID")
    private String id;

    @Column(name = "TEACHER_NAME")
    private String name;

    //연관 관계 설정
    /*@OneToMany(mappedBy = "teacher")
    private Set<Member> members = new HashSet<Member>();*/

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //멤버 추가
    /*public void addMember(Member member) {
        members.add(member);
    }*/
}