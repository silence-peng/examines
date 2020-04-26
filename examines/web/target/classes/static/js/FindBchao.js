layui.use(['form', 'layer', 'table', 'laydate','jquery'], function() {
	var form = layui.form,
		layer = layui.layer,
		laydate = layui.laydate,
		table = layui.table,
		$ =layui.jquery;

	//日期
	laydate.render({
		elem: '#creatdate'
	});
	laydate.render({
		elem: '#date1'
	});
	table.render({
		elem: '#test',
		url: '/image/getUser',
		method:"post",
		limit:3,
		limits:[3,6],
		cols: [[
			{field: 'userid',title: '编号',sort: true}
			, {field: 'fname',title: '妻子姓名'}
			, {field: 'fcard',title: '妻子证件号'}
			, {field: 'fbirthdate',title: '妻子出生日期'}
			, {field: 'mname',title: '丈夫姓名'}
			, {field: 'mcard',title: '丈夫证件号'}
			, {field: 'mbirthdate',title: '丈夫出生日期'}
			, {field: 'creatdate',title: '建档日期'}
			/*, {title:'操作', toolbar: '#barDemo'}*/
			]],
		id:'testReload',
		page:{
			curr: 1 //设定初始在第 5 页
			,groups: 4//只显示 1 个连续页码
			,first: true //不显示首页
			,last: true //不显示尾页
		}
	});

	form.on('submit(formDemo)', function(data) {
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
				creatdate:$("#creatdate").val()
			}
		});
		return false;
	});

	table.on('tool(test)', function(obj) {
		var data = obj.data;
		if (obj.event === 'edit') {
			location.href="/image/openImage?userid="+data.userid;
		}
	});
});
