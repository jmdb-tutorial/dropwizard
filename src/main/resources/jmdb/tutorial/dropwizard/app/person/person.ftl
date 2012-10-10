<#-- @ftlvariable name="" type="jmdb.tutorial.dropwizard.app.person.PersonView" -->
<html>
<body>
<!-- calls getData().getName() on the view and sanitizes it -->
<h1>This is a person called, ${data.name?html}!</h1>
<h2>This person is ${data.age?html} years old.</h2>
</body>
</html>

