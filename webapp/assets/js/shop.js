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
			},
			error : function(jqXHR, status, error) {
				console.error(status + " : " + error);
			}
		});
	});
	
	$("#btn-buy").on("click", function() {
		alert("구매하셨습니다.");
	});
});