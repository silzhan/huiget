(function($) {
	$(".trash").on("click", function() {
		if (confirm("确定删除该条记录？")) {
			var id = $(this).data("id");
			$.post($(this).data("url"), {
				id : id
			}, function(data) {
				if (data.status == 200) {
					$("#info-item-" + id).remove();
					var itemNum = $("#item-num");
					if (itemNum) {
						itemNum.text(parseInt(itemNum.text()) - 1);
					}
					var itemRemaining = $("#item-remaining");
					if (itemRemaining) {
						itemRemaining.text(parseInt(itemRemaining.text()) + 1);
					}
				} else if (data.status == 403) {
					alert("你没有权限执行此操作");
				} else if (data.status == 500) {
					alert("服务端异常，操作失败");
				} else {
					alert(data.errorMsg);
				}
			});
		}
	});
})($);