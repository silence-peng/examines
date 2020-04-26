layui.use(['form', 'layer', 'table', 'laydate'], function() {
	var form = layui.form,
		layer = layui.layer,
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
		url: '/image/image',
		limit:3,
		limit:[3,6],
		cols: [[
			{field: 'userid',title: '编号',sort: true}
			, {field: 'fname',title: '妻子姓名'}
			, {field: 'fcard',title: '妻子证件号'}
			, {field: 'fbirthdate',title: '妻子出生日期'}
			, {field: 'mname',title: '丈夫姓名'}
			, {field: 'mcard',title: '丈夫证件号'}
			, {field: 'mbirthdate',title: '丈夫出生日期'}
			, {field: 'creatdate',title: '建档日期'}
			, {title:'操作', toolbar: '#barDemo'}
			]],
		page: {
			groups: 4 //只显示 4 个连续页码
			,first: true //显示首页
			,last: true //显示尾页
		}
	});

	form.on('submit(formDemo)', function(data) {
		let param = $("form").serialize();
		table.reload('testReload', {
			page : {
				curr : 1
				// 重新从第 1 页开始
			},
			where : {
				userid:$("#userId").val(),
				mname:$("#mName").val(),
				fname:$("#fName").val(),
				mcard:$("#mCard").val(),
				fcard:$("#fCard").val(),
				creatdate:$("#date").val()
			}
		});
		return false;
	});
});
