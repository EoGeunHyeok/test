package com.cod.TripInJeju.member.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String nickname;
    private String email;
    @CreatedDate
    private LocalDateTime createDate;
    @LastModifiedDate
    private LocalDateTime modifyDate;

    @Enumerated(EnumType.STRING)
    private MemberRole role;


    // 소셜

    @Column(unique = true)
    @Comment("유저 아이디")
    private String loginId;

    private String provider;

    private String providerId;
    private String googleId;
    private String naverId;
    public String getGoogleId() {
        return googleId;
    }

    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }

    public String getNaverId() {
        return naverId;
    }

    public void setNaverId(String naverId) {
        this.naverId = naverId;
    }



}
