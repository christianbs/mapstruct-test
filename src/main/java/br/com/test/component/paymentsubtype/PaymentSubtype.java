package br.com.test.component.paymentsubtype;

import br.com.test.component.paymenttype.PaymentType;
import br.com.test.shared.jpa.AbstractAuditableEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;


@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentSubtype extends AbstractAuditableEntity {

    private int id;

    private String name;

    private String icon;
    
    private PaymentType paymentType;

    void update(final String name,
                final String icon,
                final PaymentType paymentType) {

        if (StringUtils.isNotBlank(name) && !name.equals(this.name)) {
            this.name = name;
        }

        if (StringUtils.isNotBlank(icon) && !icon.equals(this.icon)) {
            this.icon = icon;
        }

        if (paymentType != null && !paymentType.equals(this.paymentType)) {
            this.paymentType = paymentType;
        }
    }

}
