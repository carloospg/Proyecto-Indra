create table ORGANIZADOR(
    ID_ORGANIZADOR number(4) primary key,
    NOMBRE varchar2(30) not null,
    CORREO varchar2(50) unique,
    TLF number(9)
);

create table UBICACION (
    ID_UBICACION number(4) primary key,
    TIPO varchar2(30) not null,
    DIRECCION varchar2(30)
);

create table CATEGORIA(
    ID_CATEGORIA number(4) primary key,
    TIPO varchar2(30)
);

create table EVENTO(
    ID_EVENTO number(4) primary key,
    NOMBRE varchar2(50) not null,
    FECHA date not null,
    DURACION varchar(4) not null,
    ID_ORGANIZADOR number(4),
    ID_UBICACION number(4),
    ID_CATEGORIA number(4),
    foreign key(ID_ORGANIZADOR) references ORGANIZADOR(ID_ORGANIZADOR),
    foreign key(ID_UBICACION) references UBICACION(ID_UBICACION),
    foreign key(ID_CATEGORIA) references CATEGORIA(ID_CATEGORIA)
);

create table USUARIO(
    ID_USUARIO number(4) primary key,
    NOMBRE varchar2(30) not null,
    CORREO varchar2(50) not null,
    CONTRASENIA varchar2(50) not null
);

create table INSCRIPCION(
    ID_INSCRIPCION number(4) primary key,
    ID_EVENTO number(4),
    ID_USUARIO number(4),
    foreign key(ID_EVENTO) references EVENTO(ID_EVENTO),
    foreign key(ID_USUARIO) references USUARIO(ID_USUARIO)
);