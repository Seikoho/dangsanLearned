create table runningman(
no number primary key,
id varchar2(20) unique,
pass varchar2(20) not null,
name varchar2(20) not null,
nickname varchar2(20) unique,
gender char(1),
tel varchar2(20) default '010-0000-0000',
address varchar2 (90)
);

insert into runningman values(1,'muhan','1234','유재석','못생긴형','M','010-4958-2333','압구정');
insert into runningman values(2,'bignose','4444','지석진','지는해','M',default,'서울');
insert into runningman values(3,'tiger','6658','김종국','안꼬','M','010-6674-8986','안양');
insert into runningman values(4,'haha','5356','하하','신분세탁','M','010-8997-1122','서래마을');
insert into runningman values(5,'ace','5555','송지효','천성임','F',default,'서울시');
insert into runningman values(6,'grrafe','6658','이광수','중기친구','M','010-2378-9991','남양주');
insert into runningman values(7,'ssapssap','5357','양세찬','김종국팬','M','010-1215-7777','동두천');
insert into runningman values(8,'doli','5555','전소민','전두릅','F',default,'일산');
select * from runningman;

update runningman set pass = '9999'  where nickname='중기친구';
update runningman set tel = '없음' where tel = '010-0000-0000';

delete running 