package br.com.test.component.paymentsubtype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentSubtypeRepository extends JpaRepository<PaymentSubtype, Integer> {

    Optional<PaymentSubtype> findByName(String name);

}
