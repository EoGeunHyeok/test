package com.cod.TripInJeju.email.repository;



import com.cod.TripInJeju.email.entity2.Verification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public  interface VerificationRepository extends JpaRepository<Verification, String> {

    Optional<Verification> findByEmailAndVerificationCode(String email, String verificationCode);
}
