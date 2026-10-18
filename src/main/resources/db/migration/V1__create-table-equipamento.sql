create table equipamentos(

    id bigint not null auto_increment,
    nome_equipamento varchar(100) not null,
    tipo varchar(100) not null,
    status varchar(100) not null,

    primary key(id)
);