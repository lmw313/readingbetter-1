$(function(){
	// 카테고리 드랍박스
	$("#dLabel1").mouseover(function(){
		$("#dLabel1").dropdown('toggle');
	});
	
	$("#dLabel2").mouseover(function(){
		$("#dLabel2").dropdown('toggle');
	});
	
	$("#dLabel3").mouseover(function(){
		$("#dLabel3").dropdown('toggle');
	});
	
	$("#dLabel4").mouseover(function(){
		$("#dLabel4").dropdown('toggle');
	});
	
	$("#dLabel5").mouseover(function(){
		$("#dLabel5").dropdown('toggle');
	});
	
	// 로고
	$("#logo").mouseover(function(){
		document.getElementById("logo").src = "http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/logo_p.png";
	});
	
	$("#logo").mouseout(function(){
		document.getElementById("logo").src = "http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/logo.png";
	});
	
	// btn-book
	$("#btn-book").mouseover(function changeElement(id){
		var el = document.getElementById("btn-book");
		el.style.height = "131.5px";
		el.src = "http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/p_reading.png";
	});
	
	$("#btn-book").mouseout(function(){
		var el = document.getElementById("btn-book");
		el.style.height = "70px";
		el.src = "http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/b_reading.png";
	});
	
	// btn-rank
	$("#btn-rank").mouseover(function changeElement(id){
		var el = document.getElementById("btn-rank");
		el.style.height = "115px";
		el.src = "http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/p_ranking.png";
	});
	
	$("#btn-rank").mouseout(function(){
		var el = document.getElementById("btn-rank");
		el.style.height = "70px";
		el.src = "http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/b_ranking.png";
	});
});