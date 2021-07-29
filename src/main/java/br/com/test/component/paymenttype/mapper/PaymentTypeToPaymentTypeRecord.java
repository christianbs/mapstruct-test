package br.com.test.component.paymenttype.mapper;

import br.com.test.component.paymenttype.PaymentType;
import br.com.test.component.paymenttype.record.PaymentTypeRecord;
import br.com.test.configuration.MapStructConfiguration;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapStructConfiguration.class)
public interface PaymentTypeToPaymentTypeRecord extends Converter<PaymentType, PaymentTypeRecord> {

    @Override
    PaymentTypeRecord convert(final PaymentType paymentType);

}
