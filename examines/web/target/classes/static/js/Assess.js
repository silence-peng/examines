layui.use(['form','layer','table','laydate','jquery'], function() {
	var form = layui.form
		,layer = layui.layer
		,laydate = layui.laydate
		,table = layui.table
		,$ = layui.jquery;
		
		laydate.render({
		   elem: '#mdate'
		});
	$.ajax({
		url:'/assesAndOther/getUser'
		,type:'post'
		,data:null
		,dataType:'json'
		,success:function(e){
			form.val("formTest",{
				"userid":e.userid,
				"mname":e.mname,
				"fname":e.fname
			});
		}
	});
	/*$.ajax({
		url:'/assesAndOther/getSuggestd'
		,type:'post'
		,data:null
		,dataType:'json'
		,success:function(e){
			$(e).each(function () {
				$("#radio").append("<div class='layui-row'>" +
					"<input type='radio' value='"+this.did+"' name='sdid' lay-verify='required' checked='checked' title='"+this.content+"'>" +
					"</div>");
			});
			form.render();
		}
	});*/

	table.render({
		elem:'#test'
		,url:'/assesAndOther/getSuggest'
		,method:"post"
		,toolbar: '#toolbarDemo'
		,defaultToolbar:false
		,cols: [[
			{type:'numbers',title:'序号'},
			{field:'id',type : 'checkbox'},
			{field:'content', title:'一般建议'}
		]]
	});

	table.on('toolbar(test)', function(obj){
		var checkStatus = table.checkStatus(obj.config.id);
		if(obj.event=="use"){
			var data = checkStatus.data;
			$(data).each(function () {
				$("#content").append(this.content+"");
			})
		}
	});

	form.on('submit(formDemo)', function(data) {
		let param = $("form").serialize();
		$.ajax({
			url:"/assesAndOther/addAssess",
			type:"post",
			data:param,
			dataType:"text",
			success:function(result){
				if(result=="ok"){
					layer.msg('保存成功!');
				}else{
					layer.msg('新建失败!');
				}
			}
		});
		return false;
	});

})