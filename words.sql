drop table words;
create table words(
no number(3) constraint words_pk primary key, 
word varchar2(15) not null
);
select * from words;
create sequence word_seq 
start with 1 
increment by 1 
nocycle 
nocache;
select * from words;
insert into words values (word_seq.nextval, 'equals');
insert into words values (word_seq.nextval, 'finalize');
insert into words values (word_seq.nextval, 'getClass'); 
insert into words values (word_seq.nextval, 'hashcode'); 
insert into words values (word_seq.nextval, 'toString'); 
insert into words values (word_seq.nextval, 'notify');
insert into words values (word_seq.nextval, 'charAt'); 
insert into words values (word_seq.nextval, 'indexOf'); 
insert into words values (word_seq.nextval, 'compareTo'); 
insert into words values (word_seq.nextval, 'concat');
insert into words values (word_seq.nextval, 'substring'); 
insert into words values (word_seq.nextval, 'toLowerCase'); 
insert into words values (word_seq.nextval, 'toUpperCase');
insert into words values (word_seq.nextval, 'trim');
insert into words values (word_seq.nextval, 'random'); 
insert into words values (word_seq.nextval, 'String'); 
insert into words values (word_seq.nextval, 'Math');
insert into words values (word_seq.nextval, 'remove');
insert into words values (word_seq.nextval, 'parseInt'); 
insert into words values (word_seq.nextval, 'JTextField'); 
insert into words values (word_seq.nextval, 'JTextArea');
insert into words values (word_seq.nextval, 'JLabel');
insert into words values (word_seq.nextval, 'JFrame'); 
insert into words values (word_seq.nextval, 'Object'); 
insert into words values (word_seq.nextval, 'void');
insert into words values (word_seq.nextval, 'boolean'); 
insert into words values (word_seq.nextval, 'int');
insert into words values (word_seq.nextval, 'double'); 
insert into words values (word_seq.nextval, 'char');
insert into words values (word_seq.nextval, 'final'); 
insert into words values (word_seq.nextval, 'static'); 
insert into words values (word_seq.nextval, 'public'); 
insert into words values (word_seq.nextval, 'length');
insert into words values (word_seq.nextval, 'split');
insert into words values (word_seq.nextval, 'Integer'); 
insert into words values (word_seq.nextval, 'size');
insert into words values (word_seq.nextval, 'SqlSession'); 
insert into words values (word_seq.nextval, 'class');
insert into words values (word_seq.nextval, 'implements'); 
insert into words values (word_seq.nextval, 'extends');
insert into words values (word_seq.nextval, 'abstract'); 
insert into words values (word_seq.nextval, 'mybatis');
insert into words values (word_seq.nextval, 'oracle');
insert into words values (word_seq.nextval, 'sqlplus'); 
insert into words values (word_seq.nextval, 'system');
insert into words values (word_seq.nextval, 'println'); 
insert into words values (word_seq.nextval, 'printf');
insert into words values (word_seq.nextval, 'print');
insert into words values (word_seq.nextval, 'inheritance'); 
insert into words values (word_seq.nextval, 'overloading'); 
insert into words values (word_seq.nextval, 'overriding');
insert into words values (word_seq.nextval, 'instance');
insert into words values (word_seq.nextval, 'polymorphism'); 
insert into words values (word_seq.nextval, 'break');
insert into words values (word_seq.nextval, 'continue'); 
insert into words values (word_seq.nextval, 'Scanner');
insert into words values (word_seq.nextval, 'StringBuffer'); 
insert into words values (word_seq.nextval, 'hashmap');
insert into words values (word_seq.nextval, 'ArrayList'); 
insert into words values (word_seq.nextval, 'LinkedList');
select * from WORDS;
						 
						 