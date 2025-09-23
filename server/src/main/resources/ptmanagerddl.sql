--v0.0.1

-- sequence for id user
create sequence ptmanager.sequenceId
minvalue 1
maxvalue 999999
increment by 1;

-- table users
create table ptmanager.Users (
    id integer default nextval('sequenceId'),
    name varchar(30) not null,
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
    idtrainer integer default nextval('sequenceId'),
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
    idexercise integer default nextval('sequenceId'),
    exercisename varchar(100) not null,
    locationfile varchar(255)
);

-- constraints for talbe exercises
alter table ptmanager.exercises
   add constraint exercisesPk
   primary key(idexercise);
