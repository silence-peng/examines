layui.use(['form','layer','table','laydate','jquery'], function() {
	var form = layui.form
		,layer = layui.layer
		,laydate = layui.laydate
		,table = layui.table
		,$ = layui.jquery;
		
		laydate.render({
		   elem: '#mdate'
		});
		
		table.render({
						elem:'#test'
						,url:'/emp/getEmp'
						,method:"post"	//如出现传中文值乱码可以加上这句，默认是get方式提交的
						,limit:3
						,limits:[3,6]
						,cols: [[
							{type:'numbers',title:'序号'},
							{field:'id',type : 'checkbox'},
						    {field:'content', title:'一般建议'}
					     ]]
						,id:'testReload' //表的id
					});
})