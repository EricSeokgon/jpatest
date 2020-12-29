package com.ncom.jpa.web.reopsitory;

import com.ncom.jpa.web.domain.Member;
import com.ncom.jpa.web.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    }
