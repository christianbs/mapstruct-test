package br.com.test.component.paymentsubtype;

import br.com.test.component.paymenttype.PaymentType;
import br.com.test.shared.jpa.AbstractAuditableEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payment_subtype")
public class PaymentSubtype extends AbstractAuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "icon")
    private String icon;

    @OneToOne
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
