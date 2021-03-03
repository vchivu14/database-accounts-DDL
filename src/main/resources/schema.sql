create table accounts
(
    account_number      int         not null
        primary key,
    account_description varchar(50) null
);

create table terms
(
    terms_id          int auto_increment
        primary key,
    terms_description varchar(50) not null,
    terms_due_days    int         not null
);

create table vendors
(
    vendor_id                 int auto_increment
        primary key,
    vendor_name               varchar(50) not null,
    vendor_address            varchar(50) null,
    vendor_city               varchar(50) not null,
    vendor_phone              varchar(50) null,
    vendor_contact_last_name  varchar(50) null,
    vendor_contact_first_name varchar(50) null,
    default_terms_id          int         not null,
    default_account_number    int         not null,
    constraint vendors_fk_accounts
        foreign key (default_account_number) references accounts (account_number),
    constraint vendors_fk_terms
        foreign key (default_terms_id) references terms (terms_id)
);

create table invoices
(
    invoice_id       int auto_increment
        primary key,
    vendor_id        int                        not null,
    invoice_number   varchar(50)                not null,
    invoice_date     date                       not null,
    invoice_total    decimal(9, 2)              not null,
    payment_total    decimal(9, 2) 				not null,
    credit_total     decimal(9, 2) 				not null,
    terms_id         int                        not null,
    invoice_due_date date                       not null,
    payment_date     date                       null,
    constraint invoices_fk_terms
        foreign key (terms_id) references terms (terms_id),
    constraint invoices_fk_vendors
        foreign key (vendor_id) references vendors (vendor_id)
);

