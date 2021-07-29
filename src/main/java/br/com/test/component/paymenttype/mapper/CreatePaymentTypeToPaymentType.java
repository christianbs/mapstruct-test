package br.com.test.component.paymenttype.mapper;

import br.com.test.component.paymenttype.PaymentType;
import br.com.test.component.paymenttype.record.CreatePaymentTypeRecord;
import br.com.test.configuration.MapStructConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapStructConfiguration.class)
public interface CreatePaymentTypeToPaymentType extends Converter<CreatePaymentTypeRecord, PaymentType> {

    @Override
    @Mapping(target = "id", ignore = true)
    PaymentType convert(final CreatePaymentTypeRecord record);

}
