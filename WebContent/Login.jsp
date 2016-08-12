<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Application</title>
</head><body>
<div class="container" align="center">
<!--   <div id="image"> -->
<!--     <img src="img/computer.jpg" style="width:640px; height:678"> -->
<!--   </div> -->

  <div id="loginForm">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Please sign in</h3>
      </div>
      <div class="panel-body">
        <form accept-charset="UTF-8" role="form">
          <fieldset>
            <div class="form-group">
              <input class="form-control" placeholder="E-mail" name="email" type="text">
            </div>
            <div class="form-group">
              <input class="form-control" placeholder="Password" name="password" type="password" value="">
            </div>
            <div class="checkbox">
              <label>
                <input name="remember" type="checkbox" value="Remember Me">Remember Me
              </label>
            </div>
            <input class="btn btn-lg btn-success btn-block" type="submit" value="Login">
          </fieldset>
        </form>
      </div>
    </div>
  </div>

</div>
</body>
