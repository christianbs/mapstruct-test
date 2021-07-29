package br.com.test.component.paymenttype;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PaymentTypeRepository {

    Optional<PaymentType> findByName(String name) {
        return null;
    }

    PaymentType create(PaymentType paymentType) {
        return null;
    }

}
