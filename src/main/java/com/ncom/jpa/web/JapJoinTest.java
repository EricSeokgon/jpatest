package com.ncom.jpa.web;

import com.ncom.jpa.web.domain.Member;
import com.ncom.jpa.web.domain.Teacher;
import com.ncom.jpa.web.domain.User;
import com.ncom.jpa.web.reopsitory.MemberRepository;
import com.ncom.jpa.web.reopsitory.TeacherRepository;
import com.ncom.jpa.web.reopsitory.UserRepository;
import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JapJoinTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    TeacherRepository teacherRepository;

    @Test
    public void insert() {

        //강사 생성
        Teacher teacher1 = new Teacher("1", "이일타");
        //Teacher teacher2 = new Teacher("2", "김이타");
        //등록
        teacherRepository.save(teacher1);
        //teacherRepository.save(teacher2);

        //맴버 생성
        Member member1 = new Member("1", "김철수", 23, "서울특별시");
        member1.setTeacher(teacher1);
        memberRepository.save(member1);

        /*Member member2 = new Member("2", "이영희", 21,"부산광역시");
        member2.setTeacher(teacher1);
        memberRepository.save(member2);

        Member member3 = new Member("3", "박수지", 22, "광주광역시");
        member3.setTeacher(teacher2);
        memberRepository.save(member3);*/

        //엔티티 조회
        for(Member m : memberRepository.findAll()) {
            System.out.println("회원 명 : "+ m.getName());
        }

        //엔티티 삭제
        //memberRepository.delete(member2);

        for(Member m : memberRepository.findAll()) {
            System.out.println("회원 명 : "+ m.getName());
        }

        Member m1 = memberRepository.findMemberByName("김철수");
        System.out.println("검색 된 회원 명 : "+ m1.getName());



    }


}

