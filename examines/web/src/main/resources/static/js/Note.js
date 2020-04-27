layui.use(['form','layer','laydate','jquery','table'], function() {
	var form = layui.form
		,layer = layui.layer
		,laydate = layui.laydate
		,$ = layui.jquery
		,table = layui.table;
		
		laydate.render({
		   elem: '#mdate'
		});
		laydate.render({
		   elem: '#fdate'
		});
		
		table.render({
			id:"info",
			elem: '#test',
			url: '/message/loadInfo',
			cols: [
				[{field:'id',type : 'checkbox'}
				,{field: 'userid',title: '编号',sort: true}
				, {field: 'fname',title: '姓名'}
				, {field: 'fcard',title: '身份证号'}
				, {field: 'fage',title: '年龄'}
				, {field: 'fbirthdate',title: '出生日期'}
				, {field: 'address',title: '评估内容'}
				, {field: 'fphone',title: '号码'}]
			],
			page: true
		});
		$("#find").click(function () {
			table.reload('info', {
				page: {
					curr: 1 //重新从第 1 页开始
				}
				, where: {
						fname: $("input[name='name']").val(),
						fbirthdate: $("input[name='startdate']").val(),
						mbirthdate: $("input[name='enddate']").val()
				}
			})
		});

});