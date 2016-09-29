$(function() {
	$("#go-result").on("click", function() {
		var str = "ajax";

		$.ajax({
			url : "/resultquiz",
			type : "POST",
			data : {
				"str" : str
			},
//			dataType : "json",
			success : function() {
			},
			error : function(jqXHR, status, error) {
				console.error(status + " : " + error);
			}
		});
	});
});