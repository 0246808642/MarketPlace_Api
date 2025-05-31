create table products(

    id bigint not null auto_increment,
    name varchar(100) not null,
    code varchar(6) not null unique,
    amount varchar(150) not null,
    specialty varchar(10) not null,
    supplier_Name varchar(100) not null,
    cep varchar(9) not null,
    city varchar(100),
    uf char(2) not null,
    complement varchar(100),
    telephone varchar(20) not null,

    primary key(id)

)