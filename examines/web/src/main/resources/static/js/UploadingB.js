var uid;
function getid(id){
    uid= id;
    layui.use(['laydate','layer','form','jquery'], function() {
        var laydate = layui.laydate;
        var layer = layui.layer;
        var form = layui.form;
        var $ = layui.jquery;

        console.log(id);
        console.log(uid);
        laydate.render({
            elem: '#mdate' //指定元素
        });
        $("#userid").val(uid);
        $.ajax({
            url:'image/getB'
            ,type:'post'
            ,data:{userid:uid}
            ,dataType:'json'
            ,success:function(e){
                if (e!=null){
                    form.val("formTest",e);
                }
            }
        })

        //监听提交
        form.on('submit(formDemo)', function(data) {
            var param = $("form").serialize();
            $.ajax({
                url:"/image/updB",
                type:"post",
                data:param,
                dataType:"text",
                success:function(result){
                    if(result=='ok'){
                        layer.msg('编辑成功！',{time:500},function(){
                            parent.layer.close(parent.layer.index);
                        });
                    }else{
                        layer.msg('编辑失败！');
                    }
                }
            });
            return false;
        });
    });
}