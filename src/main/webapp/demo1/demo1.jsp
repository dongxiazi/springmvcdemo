<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>controller方法返回值</title>
    <script src="/js/jquery-1.7.2.min.js" type="text/javascript"></script>
    <script>

        $(function () {
            $("#btn").click(function () {
                //发送ajax
                $.ajax({
                    type:"post",
                    url:"/user/save6.do",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"haha","age":"20"}',
                    dataType:"json",
                    success:function (d) {
                        alert(d.username+d.age);
                    }
                });

            });
        });
    </script>
</head>
<body>
<h3>返回值是String</h3>
<a href="/user/save1.do">返回String</a>

<h3>返回值是void</h3>
<a href="/user/save2.do">返回void</a>

<h3>返回值是ModelAndView</h3>
<a href="/user/save3.do">返回ModelAndView</a>

<h3>返回值是String转发</h3>
<a href="/user/save4.do">返回String</a>

<h3>返回值是String重定向</h3>
<a href="/user/save5.do">返回String</a>


<h3>异步的数据交互</h3>
<form action="/upload.do" method="post"  enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"><br/>
    <input type="submit" value="上传文件">

</form>

<h3>文件上传</h3>

<input type="button" value="ajax交互" id="btn">
</body>

</html>
