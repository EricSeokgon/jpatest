package com.ncom.jpa.web;

import com.ncom.jpa.web.domain.User;
import com.ncom.jpa.web.reopsitory.UserRepository;
import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JapMappingTest {
    private final String name = "유재석";
    private final String email = "ncom@e-ncom.co.kr";

    @Autowired
    UserRepository userRepository;

    @Before
    public void init() {
        User user = userRepository.save(User.builder()
                .id(1L)
                .name(name)
                .phone("01012345678")
                .email(email)
                .createdDate(LocalDateTime.now())
                .build());

    }

    @Test
    public void 제대로_생성됐는지_테스트() {
        User user = userRepository.findByEmail(email);

        assertThat(user.getName(), is("유재석"));
        assertThat(user.getPhone(), is("01012345678"));
        assertThat(user.getEmail(), is("ncom@e-ncom.co.kr"));
    }

    @Test
    public void 수정_테스트() {
        User user = userRepository.findByEmail(email);
        user.setName("강호동");

        assertThat(user.getName(), is("강호동"));
        assertThat(user.getPhone(), is("01012345678"));
        assertThat(user.getEmail(), is("ncom@e-ncom.co.kr"));
    }

    @Test
    public void 삭제_테스트() {
        //userRepository.deleteAll();

        //assertThat(userRepository.findAll(), IsEmptyCollection.empty());
    }

}
