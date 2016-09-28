$(function() {
	$(".btn-confirm").on("click", function() {
		var no = $(this).val();

		$.ajax({
			url : "readAjax",
			type : "POST",
			data : {
				"no" : no
			},
			dataType : "json",
			success : function(shopvo) {
				$("#title").html(shopvo.title);
				$("#price").html(shopvo.price);
				$("#no").val(shopvo.no);
			},
			error : function(jqXHR, status, error) {
				console.error(status + " : " + error);
			}
		});
	});
	
	$("#btn-buy").on("click", function() {
		var price= $("#price").text();
		var no =$("#no").val();
		var title= $("#title").text();
		
		$.ajax({
			url : "/readingbetter/shop/buy",
			type : "POST",
			data : {
				"price" : price,
				"no" : no,
				"title" : title
			},
			dataType : "json",
			success : function(scoresVo) {
				console.log("scores");
			},
			error : function(jqXHR, status, error) {
				console.error(status + " : " + error);
			}
		});
	});
});