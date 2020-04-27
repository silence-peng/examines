layui.use(['form','layer','laydate','jquery','table'], function() {
	var form = layui.form
		,layer = layui.layer
		,laydate = layui.laydate
		,$ = layui.jquery
		,table = layui.table;
		
		laydate.render({
		   elem: '#startdate'
		});
		laydate.render({
		   elem: '#enddate'
		});
		
		table.render({
			elem: '#test',
			url: '/message/noteByUser',
			limit:3,
			limits:[3,6],
			cols: [
				[{field: 'userid',title: '编号',sort: true}
				, {field: 'fname',title: '姓名'}
				, {field: 'fcard',title: '身份证号'}
				, {field: 'fage',title: '年龄'}
				, {field: 'fbirthdate',title: '出生日期'}
				, {field: 'address',title: '地址'}
				, {field: 'fphone',title: '号码'},
				, {title:'操作', toolbar: '#barDemo'}]
			],
			page: true,
			id:'testReload'
		});
	form.on('submit(formDemo)', function(data) {
		table.reload('testReload', {
			page : {
				curr : 1
				// 重新从第 1 页开始
			},
			where : {
				fname:$("#fname").val(),
				fcity:$("#fcity").val(),
				mbirthdate:$("#mbirthdate").val(),
				fbirthdate:$("#fbirthdate").val()
			}
		});
		return false;
	});
});