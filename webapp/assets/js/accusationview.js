$(function() {
	$("#btn-accept").on("click", function() {
		var accept = $(":input[name=accept]:radio:checked").val();
		var no = $("input[name=no]").val();
		var id = $("input[name=id]").val();
		
		console.log(accept);
		console.log(no);
		console.log(id);
		
		var vo = {
				"no" : no,
				"accept" : accept,
				"id" : id
		}
		
		$.ajax({
			url : "../update",
			type : "POST",
			data : JSON.stringify(vo),
			contentType: "application/json", 
//			dataType : "json",
			success : function() {
//				var url = "resultquiz?count=" + count + "&no=" + bookNo;
//				
//				location.replace(url);
			},
			error : function(jqXHR, status, error) {
				console.error(status + " : " + error);
			}
		});
	});
});