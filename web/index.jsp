<%@include file="/header.jsp" %>
        <h1> Join Our Email</h1>
        <p>To Join Our Email list, enter your name and email address below.</p>
        <p><i>${message}</i></p>
        <form action="emailList" method="post">
            <input type="hidden" name="action" value="add">
            
            <label>Email:</label>
            <input type="email" name="email" value="${user.email}"><br>
            
            <label>First Name:</label>
            <input type="text" name="firstName" value="${user.firstName}"><br>
            
            <label>Last Name:</label>
            <input type="text" name="lastName" value="${user.lastName}"><br>
            
            <label>&nbsp;</label>
            <input type="submit" value="Join Now" id="submit">
        </form>
        <a href="emailList?action=checkAnchor">Check Anchor</a>
       
        <%@include file="/footer.jsp" %>
