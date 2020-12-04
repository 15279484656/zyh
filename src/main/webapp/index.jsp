<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h4>一、基本类型</h4>
<a href="account/save?name=zs&age=18">基本数据类型和String</a>
<h3>二、pojo类型</h3>
<form action="account/update" method="post">
    账户名称：<input type="text" name = "name"><br/>
    账户金额：<input type="text" name = "monkey"><br/>
    账户省份：<input type="text" name = "address.provinceName"><br/>
    账户城市：<input type="text" name = "address.cityName"><br/>

    <input type="submit" value="保存">
</form>
<h3>POJO类中包含list</h3>
<form action="account/delete" method="post">
    用户名称： <input type="text" name="name"><br/>
    用户密码： <input type="password" name="password"><br/>
    用户年龄： <input type="text" name="age"><br/>
    账户1名称：<input type="text" name="accounts[0].name"><br/>
    账户1金额：<input type="text" name="accounts[0].money"><br/>
    账户2名称：<input type="text" name="accounts[1].name"><br/>
    账户2金额：<input type="text" name="accounts[1].money"><br/>
    <input type="submit" value="保存">
</form>
<br/>
<h3>POJO类中包含map</h3>
<form action="account/findAll" method="post">
    用户名称： <input type="text" name="name"><br/>
    用户密码： <input type="password" name="password"><br/>
    用户年龄： <input type="text" name="age"><br/>
    账户1名称：<input type="text" name="accountMap[one].name"><br/>
    账户1金额：<input type="text" name="accountMap[one].money"><br/>
    账户2名称：<input type="text" name="accountMap[two].name"><br/>
    账户2金额：<input type="text" name="accountMap[two].money"><br/>
    <input type="submit" value="保存">
</form>
<br/>
<h3>特殊类型处理</h3>
<a href="account/findById?birthday=1998-04-12">自定义类型转换器</a>
<br/>
<%--<h3>Servlet API</h3>--%>
<%--<a href="account/count?name=zyh">Servlet API</a>--%>
</body>
</html>
