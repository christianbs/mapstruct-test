CREATE TABLE payment_type
(
    id               BIGSERIAL PRIMARY KEY,
    create_date      TIMESTAMP    NOT NULL,
    last_update_date TIMESTAMP    NOT NULL,
    name             VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE payment_subtype
(
    id               BIGSERIAL PRIMARY KEY,
    create_date      TIMESTAMP    NOT NULL,
    last_update_date TIMESTAMP    NOT NULL,
    name             VARCHAR(255) NOT NULL UNIQUE,
    icon             VARCHAR(255),
    payment_type_id  INT          NOT NULL,
    UNIQUE (payment_type_id, name),
    FOREIGN KEY (payment_type_id) REFERENCES payment_type (id),
    CONSTRAINT payment_subtype_unique UNIQUE (name, icon, payment_type_id)
);
