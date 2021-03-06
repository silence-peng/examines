layui.use(['form','layer','laydate','jquery'], function() {
    var form = layui.form
        ,layer = layui.layer
        ,laydate = layui.laydate
        ,$ = layui.jquery;

    form.on('radio(isabnormal)',function () {
        console.log(true);
        if (this.value==="0"){
            console.log(0);
            $("#abnormalities").attr("disabled",true);
        }else {
            console.log(1);
            $("#abnormalities").attr("disabled",false);
        }
    });
/*显示用户信息*/

    /*检查结果*/
    $.ajax({
        url:'/checkProve/getYxResult'
        ,type:'post'
        ,data:{sex:1}
        ,dataType:'json'
        ,success:function(e){
            if (e.isover==1){
                $.ajax({
                    url:'/checkProve/getUserByuserid'
                    ,type:'post'
                    ,data:null
                    ,dataType:'json'
                    ,success:function(result){
                        $("#sex").val("男");
                        $("#mimg").append("<img src='image/img/"+result.mimg+"' width='150' height='150\'>");
                        form.val("formTest",result);
                    }
                });
                form.val("formTest",e);
                $.post('/checkProve/getAdviseArr',{sex:1},function (result) {
                    var arr=[];
                    arr=result.split(",");
                    $("input[name='yxid']").each(function () {
                        for (var i=0;i<arr.length;i++){
                            if($(this).val()==parseInt(arr[i])){
                                $(this).attr("checked",true);
                            }
                        }
                    });
                    form.render();
                })
            }
        }
    });
    /*医学意见*/
    $.ajax({
         url:'/checkProve/getYxAdvise'
        ,type:'post'
        ,data:null
        ,dataType:'json'
        ,success:function(e){
            $(e).each(function(){
                $("#advise").append("<div class='layui-form-item' style='margin-left: 40px;'>"+
                                        "<div class='layui-inline layui-bg-gray suggest'>" +
                                        "<input type='checkbox' value='"+this.yxid+"' name='yxid' lay-skin='primary'>" +
                                        "</div>" +
                                        "<div class='layui-bg-gray layui-inline suggests'>" +this.yxitem+"</div>"+
                                    "</div>");
            });
            form.render();
        }
    });
    $(".print").click(function () {
        Print('#wrap', {
            onStart: function () {
                console.log('onStart', new Date())
            },
            onEnd: function () {
                console.log('onEnd', new Date())
            }
        })
    });
    /*提交*/
    form.on('submit(formDemo)', function(data) {
        if($("#userid").val()!=null && $("#userid").val()!=''){
            var arrobject = [];
            /*得到医学意见所选的值*/
            $("input[name='yxid']").each(function() {
                if (this.checked) {
                    arrobject.push($(this).val());

                }
            });
            /*有无异常*/
            var isabnormal=0;
            $("input[name='isabnormal']").each(function () {
                if (this.checked){
                    isabnormal = $(this).val();

                }
            });
            var arrString =arrobject.join(",");
            console.log(arrString);
            var param={arr:arrString,isabnormal:isabnormal,abnormalities:$("#abnormalities").val(),resultid:$("#resultid").val()};
            console.log(param);
            $.ajax({
                url:"/checkProve/save",
                type:"post",
                data:param,
                dataType:"text",
                success:function(result){
                    if(result=="ok"){
                        layer.msg('保存成功！');

                    }else{
                        layer.msg('保存失败！');
                    }
                }
            });
        }else{
            layer.msg("请先提交检查结果");
        }
        return false;
    });



});