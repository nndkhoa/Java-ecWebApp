<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:main>
  <jsp:body>
    <div class="card">
      <h4 class="card-header">
        Profile
      </h4>
      <div class="card-body">
        Thông tin cá nhân người dùng đang đăng nhập, lấy từ session.getAttibute("authUser").
      </div>
    </div>
  </jsp:body>
</t:main>