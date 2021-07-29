package br.com.test.component.paymentsubtype;

import br.com.test.component.paymentsubtype.record.CreatePaymentSubtypeRecord;
import br.com.test.component.paymentsubtype.record.PaymentSubtypeRecord;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentSubtypeFacade {

    private final ConversionService converter;


    PaymentSubtypeRecord create(final CreatePaymentSubtypeRecord record) {
        final var toCreate = converter.convert(record, PaymentSubtype.class);
        return converter.convert(toCreate, PaymentSubtypeRecord.class);
    }

}
