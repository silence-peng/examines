layui.use(['form', 'layedit', 'table', 'laydate'], function() {
	var form = layui.form,
		layer = layui.layer,
		layedit = layui.layedit,
		laydate = layui.laydate,
		table = layui.table;

	//日期
	laydate.render({
		elem: '#date'
	});
	laydate.render({
		elem: '#date1'
	});
	table.render({
		elem: '#test',
		url: '/demo/table/user/',
		cols: [
			[{field: 'id',title: '编号',sort: true}
			, {field: 'username',title: '妻子姓名'}
			, {field: 'sex',title: '妻子证件号'}
			, {field: 'city',title: '妻子出生日期'}
			, {field: 'username',title: '丈夫姓名'}
			, {field: 'experience',title: '丈夫证件号'}
			, {field: 'score',title: '丈夫出生日期'}
			, {field: 'classify',title: '建档日期'}]
		],
		page: true
	});


});
