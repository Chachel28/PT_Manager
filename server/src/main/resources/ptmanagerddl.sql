
-- ## CREATES ##

-- uncomment to create schema too
-- CREATE SCHEMA ptmanager AUTHORIZATION ptmanager;

-- sequence for id user
create sequence ptmanager.sequenceIdUser
minvalue 1
maxvalue 999999
increment by 1;

-- sequence for id trainer
create sequence ptmanager.sequenceIdtrainer
minvalue 1
maxvalue 999999
increment by 1;

-- sequence for id exercise
create sequence ptmanager.sequenceIdexercise
minvalue 1
maxvalue 999999
increment by 1;


-- table users
create table ptmanager.Users (
    id integer default nextval('sequenceIduser'),
    fullname varchar(30) not null,
    mail varchar(50) not null,
    pass varchar(20) not null
);

-- constraints for table users
alter table ptmanager.Users
   add constraint usersPk
   primary key(id),
   add constraint mail
   unique(mail);

-- table trainers
create table ptmanager.trainers (
    idtrainer integer default nextval('sequenceIdtrainer'),
    iduser integer not null
);

-- constraints for table trainers
alter table ptmanager.trainers
   add constraint trainersPk
   primary key(idtrainer),
   add constraint trainersFk
   foreign key (iduser) references ptmanager.users(id)
   on delete cascade
   on update cascade;

-- table trainees
create table trainees (
    iduser integer not null,
    idtrainer integer not null
);

-- constraints for table trainees
alter table ptmanager.trainees
   add constraint traineePk
   primary key(iduser, idTrainer),
   add constraint traineeUserFk
   foreign key (iduser) references ptmanager.users(id)
        on delete cascade
        on update cascade,
        add constraint traineeTrainerFk
   foreign key (idtrainer) references ptmanager.trainers(idtrainer)
        on delete cascade
        on update cascade;

-- table exercises
create table ptmanager.exercises (
    idexercise integer default nextval('sequenceIdexercise'),
    exercisename varchar(100) not null,
    locationfile varchar(255)
);

-- constraints for talbe exercises
alter table ptmanager.exercises
   add constraint exercisesPk
   primary key(idexercise);



-- ## INSERTS ##

INSERT INTO ptmanager.users
(id, fullname, mail, pass)
VALUES(1, 'Guillermo', 'test@test.es', '1234');

INSERT INTO ptmanager.users
(id, fullname, mail, pass)
VALUES(2, 'Alejandro', 'test2@test.es', '4321');

INSERT INTO ptmanager.trainers
(idtrainer, iduser)
VALUES(1, 2);

INSERT INTO ptmanager.trainees
(idtrainer, iduser)
VALUES(2, 2);

INSERT INTO ptmanager.exercises
(idexercise, exercisename, locationfile)
VALUES(2, 'Sentadilla', 'afgvasdfxagfvaxcga');

