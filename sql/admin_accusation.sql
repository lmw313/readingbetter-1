select * from accusation order by no asc;
select * from comments order by no asc;
select * from review order by no asc;

delete from accusation where no=41;

select a.review as content, 
			 b.id 
			from review a, member b 
			where b.no = a.member_no and a.no=1;
      
select c.CONTENT, m.ID from comments c, member m where c.MEMBER_NO = m.NO and c.no=1;