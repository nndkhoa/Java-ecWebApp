<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<t:main>
  <jsp:body>
    <form action="" method="post">
      <div class="card">
        <h4 class="card-header">
          New Category
        </h4>
        <div class="card-body">
          <div class="form-group">
            <label for="txtCatName">Category</label>
            <input type="text" class="form-control" id="txtCatName" name="CatName" autofocus>
          </div>
        </div>
        <div class="card-footer">
          <a class="btn btn-outline-success" href="${pageContext.request.contextPath}/Admin/Category/" role="button">
            <i class="fa fa-backward" aria-hidden="true"></i>
            List
          </a>
          <button type="submit" class="btn btn-primary">
            <i class="fa fa-check" aria-hidden="true"></i>
            Save
          </button>
        </div>
      </div>
    </form>
  </jsp:body>
</t:main>