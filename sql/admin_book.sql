select * from book order by no asc;
select * from publisher order by no asc;
select * from author order by no asc;

insert into book 
  values(seq_book.nextval, 
         '고양이 시리즈 01', 
         '1', 
         'http://cfile230.uf.daum.net/image/13363F4350F4CB8B119B2D', 
         (select no from publisher where title='테스트출판사'),
         (select no from author where name='고양이 마니아'));
commit;

select * from author where name='강아지 마니아';
insert into author values(seq_author.nextval, '강아지 마니아');
rollback;

select no from publisher where title='테스트2';
insert into publisher values(seq_author.nextval, '테스트2');