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

		upload.render({
			elem: '#test1'
			,url: '/image/updateImg'
			,auto: false//选择文件后不自动上传
			,bindAction: '#commit'
			,before: function(){
				this.data={
					userid:$("#userid").val()
				}
			}
			//选择文件后的回调
			,choose: function (obj) {
				obj.preview(function (index, file, result) {
					$('#demo1').attr('src', result);
				})
			}
			//操作成功的回调
			,done: function(res){
				//如果上传失败
				if(res.code > 0){
					return layer.msg('上传失败');
				}else{
					return layer.msg('上传成功');
				}
			}
			//上传错误回调
			,error: function (index, upload) {
				layer.alert('上传失败！' + index);
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
					if (result.bimgfile!=null){
						$("#minImg").append("<img width='50px' src='../image/img/"+result.bimgfile+"' id='img1'/><label name='imgsize' id='size'>"+result.imgsize+"KB</label>");
						$("#maxImg").append("<img width='90%' style='padding: 30px;' id='img2' src='../image/img/"+result.bimgfile+"'/>");
					}else{
						$("#minImg").append("暂未图片信息");
						$("#maxImg").append("暂未图片信息");
					}
					form.val("formTest",result);
				}
			});
			return false;
		});
		$("#minImg").dblclick(function () {
			$.post('/image/deleteImg',{userid:$("#userid").val()},function (e) {
				if(e=="ok"){
					$("#minImg").html(null);
					$("#maxImg").html(null);
				}
			})
		})
	});
})