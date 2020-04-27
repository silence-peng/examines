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
					$('#demo1').attr('src', '/img/'+result);
				})
			}
			//操作成功的回调
			,done: function(res){
				//如果上传失败
				if(res.code > 0){
					layer.msg('上传失败');
				}else{
					layer.msg('上传成功');
					location.reload();
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
					$('#img1').attr('src', result.bimgfile);
					$('#img2').attr('src', result.bimgfile);
					$("#minImg").append("<label name='imgsize'>"+result.imgsize+"kb</label>")
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