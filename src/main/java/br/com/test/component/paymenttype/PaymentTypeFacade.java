package br.com.test.component.paymenttype;

import br.com.test.component.paymenttype.record.CreatePaymentTypeRecord;
import br.com.test.component.paymenttype.record.PaymentTypeRecord;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentTypeFacade {

    private final PaymentTypeRepository repository;
    private final ConversionService converter;

    PaymentTypeRecord create(final CreatePaymentTypeRecord record) {
        final var toCreate = converter.convert(record, PaymentType.class);
        final var created = repository.save(toCreate);
        return converter.convert(created, PaymentTypeRecord.class);
    }

}
