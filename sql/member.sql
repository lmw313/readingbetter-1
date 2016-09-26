-- select
select no, name from member where id='ysi1246' and pw='abcd1234';
select title from school order by title asc;
select title from school where title like '%' || '테스트' || '%' order by title asc;

select id from member where id='kmg878';
select email from member where email='kmg878@naver.com';

-- insert
insert into member values(seq_member.nextval, 'test01', 'aaaa', 'test', 'test01@naver.com', '01000001111', sysdate, 1, 0, '', '', (select no from school where title='성결초등학교'));

select no from school where title='성결초등학교';