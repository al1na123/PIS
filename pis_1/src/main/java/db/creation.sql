create table commands
(
    id         serial PRIMARY KEY,
    name varchar(64),
);

create table questions
(
    id           serial PRIMARY KEY,
    pack_num         int ,
    type varchar (64),
    question varchar(64),
);

create table result
(
    pack    serial REFERENCES questions,
    command serial REFERENCES commands,
    grade      int
        CONSTRAINT valid_grade CHECK ( grade >= 0)
);

create table answers
(
    question        serial REFERENCES questions,
    type              varchar(64),
    answer varchar (64),
);


create table tips
(
    question serial REFERENCES questions,
    type     varchar(64),
    tip      varchar(64),
)

