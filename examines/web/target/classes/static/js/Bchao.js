$(function () {
	layui.use(['form','layer','laydate','jquery','upload'], function() {
		var form = layui.form
			,layer = layui.layer
			,laydate = layui.laydate
			,$ = layui.jquery
			,upload = layui.upload;

		laydate.render({
			elem: '#mdate'
		});

		var uploadInst = upload.render({
			elem: '#test1'
			,url: 'https://httpbin.org/post' //改成您自己的上传接口
			,before: function(obj){
				obj.preview(function(index, file, result){
					$('#demo1').attr('src', result); //图片链接（base64）
				});
			}
			,done: function(res){
				//如果上传失败
				if(res.code > 0){
					return layer.msg('上传失败');
				}
				//上传成功
			}
		});

		$.ajax({
			url:'/image/openImage'
			,type:'post'
			,data:null
			,dataType:'json'
			,success:function(e){
				form.val("formTest",e);
			}
		});
		form.on('submit(formDemo)', function(data) {
			console.log($("#userid").val());
			$.ajax({
				url:"/image/getB",
				type:"post",
				data:{userid:$("#userid").val()},
				dataType:"json",
				success:function(result){
					$("#minImg").html("");
					$("#maxImg").html("");
					if(result.bimgfile!=null && result.bimgfile!=""){
						$("#minImg").append("<img src='"+result.bimgfile+"' width='50px' height='40px'/>" +
							"<label name='imgsize'>"+result.imgsize+"</label>");
						$("#maxImg").append("<img src='"+result.bimgfile+"' width='90%' style='padding: 30px;'/>");
					}else{
						var p = "<p>暂未图片信息</p>";
						$("#maxImg").append(p);
						$("#minImg").append(p);
					}
					console.log(result.bdoctorname);
					form.val("formTest",result);
				}
			});
			return false;
		});
		$("#minImg").dblclick(function () {
			$.post('/image/deleteImg',{userid:$("#userid").val()},function (e) {
				if(e=="ok"){
					$("#minImg").hide();
					$("#maxImg").hide();
				}
				$("#maxImg").hide();
			})
		})
	});
})