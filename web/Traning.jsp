<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@ include file="from_heder.html" %>
<div style="width:25% ;float:left;height:80% ;background-color:#F5F5F5;">
	<ul class="list-group">
	  <li class="list-group-item">
	    <span class="glyphicon glyphicon-ok"></span>
	    <a href="Ps.jsp">Personal Details</a>
	  </li>
	  <li class="list-group-item">
	  <span class="glyphicon glyphicon-ok"></span>
	    <a href="Ac.jsp">Academic Details</a>
	  </li>
	  <li class="list-group-item">
	    <span class="glyphicon glyphicon-ok"></span>
		 <a href="p&t.jsp">Training</a>
	  </li>
	  <li class="list-group-item">
	   <span class="glyphicon glyphicon-ok"></span>
	    <a href="Pro.jsp">Projects</a>    
	  </li>
	  <li class="list-group-item">
	    <span class="glyphicon glyphicon-ok"></span>
		 <a href="Comp.jsp">Computer Skills</a>
	  </li>
	  <li class="list-group-item">
	    <span class="glyphicon glyphicon-ok"></span>
		 <a href="exp.jsp">Experience</a>   
	  </li>
	  <li class="list-group-item">
		   <a href="ph.jsp">Photo and Signature upload</a>
	    <span class="glyphicon glyphicon-remove"></span>
    
	  </li>
	</ul>

</div>
<div class="panel panel-default" style="width:75% ;float:right;height:80%">
  <!-- Default panel contents -->
  <div class="panel-heading">Traning</div>
  <div class="panel-body">
  <form role="form" action="Pro.jsp" method="post" >
    <table style="width:100%; height :75%;">
  <tr>
    <td><label for="name1">Institution 1 :</label></td>
    <td><input type="text" class="form-control" id="name1" placeholder="Project Undertaken"></td> 
  </tr>
  <tr>
      <td><label for="name2">Institution 2 :</label></td>
      <td><input type="text" class="form-control" id="name2" placeholder="Project Undertaken"></td> 
  </tr>
   <tr>
       <td><label for="name3">Institution 3(Optional) :</label></td>
       <td><input type="text" class="form-control" id="name3" placeholder="Project Undertaken"></td> 
  </tr>
  <tr>
      <td><label for="name4">Institution 4(Optional) :</label></td>
      <td><input type="text" class="form-control" id="name4" placeholder="Project Undertaken"></td> 
  </tr>
   <tr>
       <td><label for="name5">Institution 5(Optional) :</label></td>
       <td><input type="text" class="form-control" id="name5" placeholder="Project Undertaken"></td> 
  </tr>
   <tr>
   </table>
   <div class="modal-footer">
        <button type="button" class="btn btn-default" >Save</button>
        <button type="Submit" value ="Submit" class="btn btn-primary">Next</button>
         

      </div>
    

</form>
  </div>

  <!-- Table -->
  
</div>
</body> 
</html>
