$(function () {
    $("#a").click(function () {
        $.post("/out",function (e) {
            location.href="login";
        })
    })
})