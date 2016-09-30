$(function() {
	$(".tab-content1").hide();

	$(".tab-box li").click(function() {
		var $li = $(".tab-box li");

		$(".tab-box li.selected").removeClass("selected");
		$li.addClass("selected");
	});

	$(".tab-box2 li").click(function() {
		var $li = $(this);

		$(".tab-box2 li.selected").removeClass("selected");
		$li.addClass("selected");

		if ($(".firstrankpage").hasClass("selected")) {
			$(".tab-content1").show();
			$(".tab-content2").hide();
		}
		if ($(".secondrankpage").hasClass("selected")) {
			$(".tab-content1").hide();
			$(".tab-content2").show();
		}
	});
	
	/*$(function() {
	   setInterval(function() {
	      var $li = $(this);
	      setTimeout(function() {
	         $(".tab-box2 li.selected").removeClass("selected");
	         $li.addClass("selected");
	      }, 3000);
	      
	      if ($(".firstrankpage").hasClass("selected")) {
	         $(".tab-content1").show();
	         $(".tab-content2").hide();
	      }
	      if ($(".secondrankpage").hasClass("selected")) {
	         $(".tab-content1").hide();
	         $(".tab-content2").show();
	      }
	   }, 6000)
	   
	 * function first() { $(".secondrankpage").addClass("selected");
	 * $(".firstrankpage").removeClass("selected"); console.log("첫번째 페이지");
	 * setTimeout(second(), 3000); } function second() {
	 * $(".secondrankpage").addClass("selected");
	 * $(".firstrankpage").removeClass("selected"); console.log("두번째 페이지");
	 * setTimeout(first(), 3000); } first();
	    
	});*/
});