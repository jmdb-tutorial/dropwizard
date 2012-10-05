<html xmlns="http://www.w3.org/1999/html">

<head>
  <title>Apply here for some funky stuff</title>
</head>

<body>
<h1>The Application Form</h1>

<div id="applicant-section">

  <form action="applicationform" method="POST">
    <div>
      <label for="firstName">First Name:</label>
      <input name="firstName" type="text"/>
    </div>

    <div>
      <label for="lastName">Last Name:</label>
      <input name="lastName" type="text"/>
    </div>

    <div>
      <label for="favouriteBooks">Favourite books</label>
      <ul>
        <li>
          <input type="checkbox" name="favouriteBooks" value="UBIK"><a
          href="http://www.amazon.co.uk/Ubik-S-F-MASTERWORKS-Philip-Dick/dp/1857988531">Ubik</a><br>
        </li>
        <li>
          <input type="checkbox" name="favouriteBooks" value="IROBOT"><a
          href="http://www.amazon.co.uk/I-Robot-Isaac-Asimov/dp/0246121009/">I Robot</a><br>
        </li>
      </ul>
    </div>

    <div>
      <label for="favouriteColor">Favourite Color</label>
      <select name="favouriteColor">
        <option value="GREEN">Green</option>
        <option value="BLUE">Blue</option>
        <option value="YELLOW">Yellow</option>
      </select>
    </div>

    <div>
      <input type="submit" name="save" value="Save for later"/>
      <input type="submit" name="apply" value="Submit"/>
    </div>
  </form>


</div>

</body>

</html>