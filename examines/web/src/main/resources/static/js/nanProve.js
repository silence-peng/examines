layui.use(['form','layer','laydate','jquery'], function() {
    var form = layui.form
        ,layer = layui.layer
        ,laydate = layui.laydate
        ,$ = layui.jquery;
    $.ajax({
        url:'/checkProve/getUserByuserid'
        ,type:'post'
        ,data:null
        ,dataType:'json'
        ,success:function(e){
            form.val("formTest",e);
        }
    });
    $.ajax({
        url:'/checkProve/getYxResult'
        ,type:'post'
        ,data:{sex:1}
        ,dataType:'json'
        ,success:function(e){
            form.val("formResult",e);
        }
    });
    $.ajax({
         url:'/checkProve/getYxAdvise'
        ,type:'post'
        ,data:null
        ,dataType:'json'
        ,success:function(e){
            $(e).each(function(){
                $("#advise").append("<div class='layui-form-item' style='margin-left: 40px;'>"+
                                        "<div class='layui-inline layui-bg-gray suggest'>" +
                                        "<input type='checkbox' value='"+this.yxid+"' name='' lay-skin='primary'>" +
                                        "</div>" +
                                        "<div class='layui-bg-gray layui-inline suggests'>" +this.yxitem+"</div>"+
                                    "</div>");
            });
        }
    });

})